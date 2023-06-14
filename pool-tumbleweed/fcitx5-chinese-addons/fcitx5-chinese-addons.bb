SUMMARY = "Pinyin and Table IM support for fcitx5"
DESCRIPTION = "This provides pinyin and table input method support for fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-chinese-addons-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "c31d44029a9d632fd4718107cb8b371de01c0584a64cdc19ca8927dba13aace8729bfb50263ac54ef483b2b41e7cbd9e13a8f658b4e4be1c4b803d7c8eb1751b"

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
libfullwidth.so \
libpinyin.so \
libpinyinhelper.so \
libpunctuation.so \
libtable.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libIMEPinyin.so.0 \
libIMETable.so.0 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libopencc.so.1.1 \
libstdc++.so.6"

inherit rpm
