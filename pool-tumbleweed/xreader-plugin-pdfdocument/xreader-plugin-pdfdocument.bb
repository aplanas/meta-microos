SUMMARY = "PDF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PDF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-pdfdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "2ad388fb95d3f43ea606e0614bdeff78f63d837379280606cd925a896f8cc4c956b9ef344d8eb0ddbbce7db739ead5466295007a634fff921376a23ceed9882b"

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
