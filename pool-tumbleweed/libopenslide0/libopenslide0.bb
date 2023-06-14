SUMMARY = "C library for reading virtual slides"
DESCRIPTION = "The OpenSlide library allows programs to access virtual slide files \
regardless of the underlying image format."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "libopenslide0-3.4.1-2.25.aarch64.rpm"
RPM_HASH = "97e7c3d3757b058cce074276301bf5e37d1c87619ca68a8150bbbee97e9b668a4b49857fe2de5a842633c5690bdb7574f16d84795d4c3cf5a84646237a041d13"

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
