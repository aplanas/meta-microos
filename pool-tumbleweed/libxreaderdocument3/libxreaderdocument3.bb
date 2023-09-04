SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "libxreaderdocument3-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "76c3bb165f34467b9af425e2253d9f8a58f2c12bff39600d02e52066ec4f4ebaeda54a8d3b606db1d62c5aef427338b8420c7506097c153347ddd226abac0e8e"

RPROVIDES:${PN} += "libxreaderdocument.so.3 \
libxreaderdocument3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libz.so.1"

inherit rpm
