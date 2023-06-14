SUMMARY = "Translation program"
DESCRIPTION = "This is a translator. It is suited only for small messages, not \
big text. Google Translate is used as a backend."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "translator-1.4.1-1.19.aarch64.rpm"
RPM_HASH = "56112791f43c091cb68c46e1cb8ca6e130fe9363bb2a77ab20941d1451edae818ffbb1a73cbbab4cb6388d44469b6544aeee660d2a68203d45e146aa2e655948"

RPROVIDES:${PN} += "translator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
