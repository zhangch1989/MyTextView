package com.zch.textview.util;

/**
 * Created by Zch on 2020/5/19 16:33.
 */

public class CommonUtils {
    /**
     * 将中文标点替换为英文标点
     *
     * @param text 要替换的文本
     * @return 替换后的文本
     */
    public static String replacePunctuation(String text) {
        text = text.replace('，', ',').replace('。', '.').replace('【', '[').replace('】', ']')
                .replace('？', '?').replace('！', '!').replace('（', '(').replace('）', ')').replace
                        ('“', '"').replace('”', '"');
        return text;
    }
}
