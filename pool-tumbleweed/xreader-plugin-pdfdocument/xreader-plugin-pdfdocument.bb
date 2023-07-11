SUMMARY = "PDF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PDF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-pdfdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "1175084f66d06914057c3b603ef615051440155a9b77d1f3935e8c35946478ee91c0dac4a2fe8ad43a3f1bec44bef31bf45fd8a0195b71b5e7ce0ef0e42a81a8"

RPROVIDES:${PN} += "libpdfdocument.so \
xreader-plugin-pdfdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpoppler-glib.so.8 \
libxml2.so.2 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
