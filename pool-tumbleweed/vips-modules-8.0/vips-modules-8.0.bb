SUMMARY = "Additional modules for libvips"
DESCRIPTION = "Additional modules for libvips."
LICENSE = "LGPL-2.1-only"

PV = "8.14.2"

RPM_NAME = "vips-modules-8.0-8.14.2-1.1.aarch64.rpm"
RPM_HASH = "427b254f6e0406e5f0d4678420b394adc0f7c6657414f96d3e1dea145560c1ed73e1b7f24df16930569a8139ffaf4e12c877f7070a99a88a71f44a1d842dda8b"

RPROVIDES:${PN} += "vips-modules-8.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
libm.so.6 \
libopenslide.so.0 \
libpoppler-glib.so.8 \
libvips.so.42 \
libvips42"

inherit rpm
