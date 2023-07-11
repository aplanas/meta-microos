SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "libxreaderview3-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "99bc0bd90a5d3fa8d5bb8798797d92bf58c8eaa26676c9ccf6dec23da0b22b06e56b7323e433c30cea44886aad71df57289949b2b375bdcf9cc73bf6661267ed"

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
