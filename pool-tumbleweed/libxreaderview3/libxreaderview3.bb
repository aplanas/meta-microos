SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "libxreaderview3-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "033fc9d9dada31b862a32cd63a6304d40ec68f2a831751021d15fdd68e6f8473529c78de08101319275df20d5853ea3fc7d554aec5695d15b6e22ba7f8c55332"

RPROVIDES:${PN} += "libxreaderview.so.3 \
libxreaderview3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwebkit2gtk-4.0.so.37 \
libxreaderdocument.so.3"

inherit rpm
