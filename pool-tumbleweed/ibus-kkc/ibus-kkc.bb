SUMMARY = "Japanese Kana Kanji input engine for IBus"
DESCRIPTION = "ibus-kkc is a Japanese Kana Kanji input engine for IBus IMF."
LICENSE = "GPL-2.0+"

PV = "1.5.22"

RPM_NAME = "ibus-kkc-1.5.22-1.10.aarch64.rpm"
RPM_HASH = "440069bfaba2e4fc696c0bd871149a2fc19c8fcac81f15d1e77eedb8a19c08e2b65af086c99c0de2a13736d0ab9b9a531229c693575e1d786f6e4b0fd095d953"

RPROVIDES:${PN} += "ibus-kkc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libjson-glib-1.0.so.0 \
libkkc.so.2"

inherit rpm
