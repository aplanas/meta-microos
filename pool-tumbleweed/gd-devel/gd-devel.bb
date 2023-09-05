SUMMARY = "Drawing Library for Programs with PNG and JPEG Output"
DESCRIPTION = "gd allows code to quickly draw images complete with lines, arcs, text, \
multiple colors, cut and paste from other images, and flood fills. gd \
writes out the result as a PNG or JPEG file. This is particularly \
useful in World Wide Web applications, where PNG and JPEG are two of \
the formats accepted for inline images by most browsers."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "gd-devel-2.3.3-3.5.aarch64.rpm"
RPM_HASH = "b40da87c3268b5163e05d1f831461461c34cffab57a4621564bb526b8bc08e897f3115cf0f063be7be8ad951d8aac6667f6ebd714fb227977348270c0814759a"

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
