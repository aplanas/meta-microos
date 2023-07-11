SUMMARY = "Development files for the VIPS library"
DESCRIPTION = "This package contains the development files for developing applications that \
want to make use of the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.14.2"

RPM_NAME = "libvips-devel-8.14.2-1.1.aarch64.rpm"
RPM_HASH = "4b29a430be5fdefe283a4d9be75274ac51b50f24a886c4ef7c011e036b0ac17c7d296fca74bbbb6cc57cb3bd47fb675ef5bcfeb13c713f50604f7d98bfa46b80"

RPROVIDES:${PN} += "libvips-devel \
pkgconfig-vips \
pkgconfig-vips-cpp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvips42 \
pkgconfig \
pkgconfig-OpenEXR \
pkgconfig-cairo \
pkgconfig-cfitsio \
pkgconfig-expat \
pkgconfig-fftw3 \
pkgconfig-fontconfig \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-imagequant \
pkgconfig-lcms2 \
pkgconfig-libexif \
pkgconfig-libgsf-1 \
pkgconfig-libjpeg \
pkgconfig-libopenjp2 \
pkgconfig-libpng \
pkgconfig-librsvg-2.0 \
pkgconfig-libtiff-4 \
pkgconfig-libwebp \
pkgconfig-libwebpdemux \
pkgconfig-libwebpmux \
pkgconfig-matio \
pkgconfig-orc-0.4 \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
pkgconfig-vips \
pkgconfig-zlib"

inherit rpm
