SUMMARY = "Pixbuf document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Pixbuf documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-pixbufdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "89aa72d0aa474fcd4b2b24a9ee1e8d28ba1d39d36c145f06e888eab54c6233ea321c819d64abf27ec3a33d05e73f5e89fd89ec3a6a50f161145598c85cd9bdee"

RPROVIDES:${PN} += "libpixbufdocument.so \
xreader-plugin-pixbufdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
