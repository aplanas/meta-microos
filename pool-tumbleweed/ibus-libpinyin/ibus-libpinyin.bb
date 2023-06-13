SUMMARY = "Intelligent Pinyin engine based on libpinyin for IBus"
DESCRIPTION = "It includes a Chinese Pinyin input method and a Chinese ZhuYin (Bopomofo) input \
method based on libpinyin for IBus."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.2"

RPM_NAME = "ibus-libpinyin-1.15.2-1.2.aarch64.rpm"
RPM_HASH = "14b705884c7b9e36e3092c931668fffa230dde6beaaa5d87d51ca46c5bd1619f4d266f4c25715d058588f7bac34208f0b6c7859b45fb6b89ce86c9ecb75cd7d9"

RPROVIDES:${PN} += "application() \
application(ibus-setup-libbopomofo.desktop) \
application(ibus-setup-libpinyin.desktop) \
ibus-libpinyin \
ibus-libpinyin(aarch-64) \
locale(ibus:zh_CN;zh_SG) \
metainfo() \
metainfo(libpinyin.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
ibus \
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
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
liblua5.4.so.5()(64bit) \
libopencc.so.1.1()(64bit) \
libpinyin.so.15()(64bit) \
libpinyin.so.15(LIBPINYIN)(64bit) \
libsoup-2.4.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
