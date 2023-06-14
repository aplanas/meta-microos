SUMMARY = "Imlib 2 - image loaders"
DESCRIPTION = "This package contains the imlib2 image loaders for: argb, bmp, gif, \
jpeg, png, pnm, tga, tiff, xpm, j2k, heif, jxl."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-loaders-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "8c4cb3337b5062020c024b2fefaa9731d1c9f62fed1a4d8c6ba5d3d0cc2baec1bea2da5eb80aef7984915ba1e6be777ee1b4662fd1e5b1e56d27c393346b4a81"

RPROVIDES:${PN} += "imlib2-loader-argb \
imlib2-loader-bmp \
imlib2-loader-bz2 \
imlib2-loader-gif \
imlib2-loader-heif \
imlib2-loader-j2k \
imlib2-loader-jpeg \
imlib2-loader-jxl \
imlib2-loader-png \
imlib2-loader-pnm \
imlib2-loader-tga \
imlib2-loader-tiff \
imlib2-loader-xpm \
imlib2-loader-zlib \
imlib2-loaders"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libbz2.so.1 \
libc.so.6 \
libgif.so.7 \
libheif.so.1 \
libid3tag.so.0.16.2 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblzma.so.5 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libz.so.1"

inherit rpm
