SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop. \
key stores. \
 \
GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-viewer-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "26a23375ed312958b92211a5962532cceb3b455bcfe5dd4cd757c21bf5b580e9a9587dc0dd4514945b4d2d5088c96148adcd351633ed5689cc10fb34f67360a8"

RPROVIDES:${PN} += "gcr-viewer \
gcr-viewer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgck-2.so.2()(64bit) \
libgcr-4.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
