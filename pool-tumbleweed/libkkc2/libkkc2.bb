SUMMARY = "Japanese Kana-string to Kana-Kanji-mixed-string convertion library"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
It was named after kkc.el in GNU Emacs, a simple Kana Kanji converter, \
while libkkc tries to convert sentences in a bit more complex way using N-gram \
language models."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "libkkc2-0.3.6~git20200818.e33e7fb-1.18.aarch64.rpm"
RPM_HASH = "1c8931dda279c3b1eb4af837ff0ca1f69d014c596b94aca4917acf4e5d0a74566631f282434ddde5436ac86d5d1549ab8efdb2779539162a520b5cc8ae3ca973"

RPROVIDES:${PN} += "libkkc.so.2 \
libkkc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
kkc-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libmarisa.so.0 \
skkdic \
skkdic-extra"

inherit rpm
