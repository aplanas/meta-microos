SUMMARY = "Zhuyin engine based on libzhuyin for IBus"
DESCRIPTION = "This package includes a Chinese Zhuyin (Bopomofo) input method based \
on libzhuyin for IBus."
LICENSE = "GPL-2.0-only"

PV = "1.10.2"

RPM_NAME = "ibus-libzhuyin-1.10.2-2.3.aarch64.rpm"
RPM_HASH = "95cabb0c4d8ad0f8384fea2fa180115ba0ec175e40545d45c20326f978e7e0cea662b1bed1a62fde507f070312fe3610b4607a89afa44e3faebf49e61c6d3490"

RPROVIDES:${PN} += "application() \
application(ibus-setup-libzhuyin.desktop) \
ibus-libzhuyin \
ibus-libzhuyin(aarch-64) \
locale(ibus:zh_TW;zh_HK) \
metainfo() \
metainfo(libzhuyin.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libzhuyin.so.15()(64bit) \
libzhuyin.so.15(LIBZHUYIN)(64bit)"

inherit rpm
