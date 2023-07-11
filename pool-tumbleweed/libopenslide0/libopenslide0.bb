SUMMARY = "C library for reading virtual slides"
DESCRIPTION = "The OpenSlide library allows programs to access virtual slide files \
regardless of the underlying image format."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "libopenslide0-3.4.1-2.26.aarch64.rpm"
RPM_HASH = "1ff21b2a686e4f25eab060597a2b7f3d409404f743c20aab45b2cc92e9ea88fe50763793c0eabad88a013ce218c71d12fa83b923ba0d4bb23cb8e81256d61f68"

RPROVIDES:${PN} += "libopenslide.so.0 \
libopenslide0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libopenjp2.so.7 \
libpng16.so.16 \
libsqlite3.so.0 \
libtiff.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
