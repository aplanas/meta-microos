SUMMARY = "GDK PixBuf Loader for libheif"
DESCRIPTION = "A ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
 \
This package contains the GDK PixBuf Loader for libheif."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "gdk-pixbuf-loader-libheif-1.16.2-1.2.aarch64.rpm"
RPM_HASH = "cf7fd81c0b2d7ab49ffcd3ef1e7893456b32f074eda7f8c7117e48e7b77d3b2075f18fda3bc61fbee5421ee4f57c2c4fea48daee22f5b85b9efff38101bb06e0"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libheif \
libpixbufloader-heif.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1"

inherit rpm
