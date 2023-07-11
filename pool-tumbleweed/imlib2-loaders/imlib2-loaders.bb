SUMMARY = "Imlib 2 - image loaders"
DESCRIPTION = "This package contains the imlib2 image loaders for: argb, bmp, gif, \
jpeg, png, pnm, tga, tiff, xpm, j2k, heif, jxl."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-loaders-1.11.1-2.1.aarch64.rpm"
RPM_HASH = "6fa73ddfc5bb7e8bf9f47555bd30cf92bfdf4ca47a8546a63f66317f3001705d2faddc9aef1cd70e061bc9d4f6068d16deea6a9953c3233691cdd1470284b72a"

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
