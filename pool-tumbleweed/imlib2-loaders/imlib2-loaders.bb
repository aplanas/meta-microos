SUMMARY = "Imlib 2 - image loaders"
DESCRIPTION = "This package contains the imlib2 image loaders for: argb, bmp, gif, \
jpeg, png, pnm, tga, tiff, xpm, j2k, heif, jxl."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-loaders-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "8c4cb3337b5062020c024b2fefaa9731d1c9f62fed1a4d8c6ba5d3d0cc2baec1bea2da5eb80aef7984915ba1e6be777ee1b4662fd1e5b1e56d27c393346b4a81"

RPROVIDES:${PN} += "imlib2-loader_argb \
imlib2-loader_bmp \
imlib2-loader_bz2 \
imlib2-loader_gif \
imlib2-loader_heif \
imlib2-loader_j2k \
imlib2-loader_jpeg \
imlib2-loader_jxl \
imlib2-loader_png \
imlib2-loader_pnm \
imlib2-loader_tga \
imlib2-loader_tiff \
imlib2-loader_xpm \
imlib2-loader_zlib \
imlib2-loaders \
imlib2-loaders(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libImlib2.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libgif.so.7()(64bit) \
libheif.so.1()(64bit) \
libid3tag.so.0.16.2()(64bit) \
libjpeg.so.8()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
liblzma.so.5()(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
