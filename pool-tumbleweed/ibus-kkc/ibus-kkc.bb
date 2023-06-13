SUMMARY = "Japanese Kana Kanji input engine for IBus"
DESCRIPTION = "ibus-kkc is a Japanese Kana Kanji input engine for IBus IMF."
LICENSE = "GPL-2.0+"

PV = "1.5.22"

RPM_NAME = "ibus-kkc-1.5.22-1.10.aarch64.rpm"
RPM_HASH = "440069bfaba2e4fc696c0bd871149a2fc19c8fcac81f15d1e77eedb8a19c08e2b65af086c99c0de2a13736d0ab9b9a531229c693575e1d786f6e4b0fd095d953"

RPROVIDES:${PN} += "application() \
application(ibus-setup-kkc.desktop) \
ibus-kkc \
ibus-kkc(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libkkc.so.2()(64bit)"

inherit rpm
