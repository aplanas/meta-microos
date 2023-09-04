SUMMARY = "Pinyin and Table IM support for fcitx5"
DESCRIPTION = "This provides pinyin and table input method support for fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-chinese-addons-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "ed576a91644730a180c6f2d9dbbcaa6bae702133ef2ff9ee349165a61a916ac15861ed08a106680a301a17e6b22174ce5115bb878ff2921c6a3c179053da2062"

RPROVIDES:${PN} += "fcitx-cloudpinyin \
fcitx-googlepinyin \
fcitx-libpinyin \
fcitx-pinyin \
fcitx-sunpinyin \
fcitx-table \
fcitx-table-cn-bingchan \
fcitx-table-cn-cangjie \
fcitx-table-cn-dianbao \
fcitx-table-cn-erbi \
fcitx-table-cn-wanfeng \
fcitx-table-cn-wubi \
fcitx-table-cn-wubi-pinyin \
fcitx-table-cn-ziran \
fcitx5-chinese-addons \
libchttrans.so \
libcloudpinyin.so \
libcustomphraseeditor.so \
libfullwidth.so \
libpinyin.so \
libpinyinhelper.so \
libpunctuation.so \
libtable.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libIMEPinyin.so.0 \
libIMETable.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libopencc.so.1.1 \
libstdc++.so.6"

inherit rpm
