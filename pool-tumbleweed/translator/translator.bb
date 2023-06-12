SUMMARY = "Translation program"
DESCRIPTION = "This is a translator. It is suited only for small messages, not \
big text. Google Translate is used as a backend."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "translator-1.4.1-1.19.aarch64.rpm"
RPM_HASH = "56112791f43c091cb68c46e1cb8ca6e130fe9363bb2a77ab20941d1451edae818ffbb1a73cbbab4cb6388d44469b6544aeee660d2a68203d45e146aa2e655948"

RPROVIDES:${PN} += "application() \
application(com.github.rapidfingers.translator.desktop) \
metainfo() \
metainfo(com.github.rapidfingers.translator.appdata.xml) \
translator \
translator(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm
