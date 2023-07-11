SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "libxreaderdocument3-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "635c3ba84b8309415868035a80d22263b2a93fd39982100d4816edfcd358f6c398f34320a9482dc2e6630ffa4f6866a87cfc2e216559a3e120f2195e159f526c"

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
