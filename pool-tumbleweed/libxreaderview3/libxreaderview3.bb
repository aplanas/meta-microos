SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "libxreaderview3-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "f49d682dd30baadfe1a616716c9905a301fb4a190f981b816987ce4a07ee1c5df2d7ff91bf5fd1c9132e580bd9be7b90893bb9a213a002e99f53454e9f1b8380"

RPROVIDES:${PN} += "libxreaderview.so.3()(64bit) \
libxreaderview3 \
libxreaderview3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgailutil-3.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libxreaderdocument.so.3()(64bit)"

inherit rpm
