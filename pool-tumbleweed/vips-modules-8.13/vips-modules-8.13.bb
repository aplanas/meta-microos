SUMMARY = "Additional modules for libvips"
DESCRIPTION = "Additional modules for libvips."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "vips-modules-8.13-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "9467a385a724b327f751a9b6968bbc8f2faf28271fad768fe4b390de1a97f0bcac7b54332db62118aaa60fe477860965cb2116d3bf0dccf34b78f342d3fdc9b2"

RPROVIDES:${PN} += "vips-modules-8.13"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libopenslide.so.0 \
libpoppler-glib.so.8 \
libvips.so.42 \
libvips42"

inherit rpm
