SUMMARY = "Sunpinyin module for fcitx"
DESCRIPTION = "SunPinyin \
=== \
 \
SunPinyin is an SLM (Statistical Language Model) based input method \
engine. To model the Chinese language, it use a backoff bigram and \
trigram language model. \
 \
Currently, SunPinyin 2.0 is available on IBus. \
 \
fcitx-sunpinyin \
=== \
 \
fcitx-sunpinyin is a wrapper around SunPinyin which enables user to use \
SunPinyin with fcitx."
LICENSE = "GPL-2.0+"

PV = "0.4.2"

RPM_NAME = "fcitx-sunpinyin-0.4.2-1.26.aarch64.rpm"
RPM_HASH = "561723b71222d480d84ac4a6232a3454adfa2584851ccb46e389824dabbffa7009cd35190e8ba33be8d0866abad4d15139163c45dbc72cd79319e0a74bc88508"

RPROVIDES:${PN} += "fcitx-sunpinyin fcitx-sunpinyin(aarch-64) locale(fcitx:zh_CN;zh_SG)"
RDEPENDS:${PN} += "fcitx libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libsunpinyin.so.3()(64bit)"

inherit rpm
