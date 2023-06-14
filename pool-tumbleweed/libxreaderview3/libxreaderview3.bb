SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "libxreaderview3-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "f49d682dd30baadfe1a616716c9905a301fb4a190f981b816987ce4a07ee1c5df2d7ff91bf5fd1c9132e580bd9be7b90893bb9a213a002e99f53454e9f1b8380"

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
