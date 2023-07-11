SUMMARY = "Drawing Library for Programs with PNG and JPEG Output"
DESCRIPTION = "gd allows code to quickly draw images complete with lines, arcs, text, \
multiple colors, cut and paste from other images, and flood fills. gd \
writes out the result as a PNG or JPEG file. This is particularly \
useful in World Wide Web applications, where PNG and JPEG are two of \
the formats accepted for inline images by most browsers."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-devel-2.3.3-3.4.aarch64.rpm"
RPM_HASH = "b50343d868d64cd38a9d1cf66aa544f99c5d10411a88128af80eff00854f6354e60ff5a1683eaeace645ab64d62907d604de832e84413f54dcc29217cafb0683"

RPROVIDES:${PN} += "gd-devel \
pkgconfig-gdlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgd3 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-libavif \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-libwebp \
pkgconfig-xpm \
pkgconfig-zlib"

inherit rpm
