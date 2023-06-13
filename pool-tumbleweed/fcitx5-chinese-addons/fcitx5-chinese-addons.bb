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
fcitx5-chinese-addons(aarch-64) \
libchttrans.so()(64bit) \
libcloudpinyin.so()(64bit) \
libfullwidth.so()(64bit) \
libpinyin.so()(64bit) \
libpinyinhelper.so()(64bit) \
libpunctuation.so()(64bit) \
libtable.so()(64bit) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.ChineseAddons.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libIMECore.so.0()(64bit) \
libIMEPinyin.so.0()(64bit) \
libIMETable.so.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libopencc.so.1.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
