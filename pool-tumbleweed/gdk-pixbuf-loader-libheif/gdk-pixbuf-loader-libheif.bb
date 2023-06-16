SUMMARY = "GDK PixBuf Loader for libheif"
DESCRIPTION = "A ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
 \
This package contains the GDK PixBuf Loader for libheif."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "gdk-pixbuf-loader-libheif-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "ec28219418c43995b134f61041584a7e0a5b0ad520cbcd0ad49ae4678d3181af1e3a83d441dde6cfbaced626588356c4fc3416a84e5e2df85f03e5a2c0f06972"

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
