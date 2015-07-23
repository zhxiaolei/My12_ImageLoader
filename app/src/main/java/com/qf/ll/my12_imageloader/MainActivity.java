package com.qf.ll.my12_imageloader;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.lidroid.xutils.BitmapUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class MainActivity extends ActionBarActivity {

    private static final String url = "http://www.kukudm.com/xpic/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BitmapUtils utils = new BitmapUtils(this);
        ImageView image = ((ImageView) findViewById(R.id.image_load));
        try {
            utils.display(image, url + URLEncoder.encode("魂环", "UTF-8") + ".Jpg");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
















