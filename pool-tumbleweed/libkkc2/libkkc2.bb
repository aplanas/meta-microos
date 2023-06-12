SUMMARY = "Japanese Kana-string to Kana-Kanji-mixed-string convertion library"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
It was named after kkc.el in GNU Emacs, a simple Kana Kanji converter, \
while libkkc tries to convert sentences in a bit more complex way using N-gram \
language models."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "libkkc2-0.3.6~git20200818.e33e7fb-1.17.aarch64.rpm"
RPM_HASH = "f3bca61c4ec5522f063a0870a347c2d3078193886971119daa5c96a8e07721066f262e4060473bac7fc258a5d6926c5f0e01b8f7bfd0c8c33c76cc656c9fc6f3"

RPROVIDES:${PN} += "libkkc.so.2()(64bit) \
libkkc2 \
libkkc2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kkc-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libmarisa.so.0()(64bit) \
skkdic \
skkdic-extra"

inherit rpm
