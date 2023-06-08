SUMMARY = "GDK PixBuf Loader for libheif"
DESCRIPTION = "A ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
 \
This package contains the GDK PixBuf Loader for libheif."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.1"

RPM_NAME = "gdk-pixbuf-loader-libheif-1.16.1-2.1.aarch64.rpm"
RPM_HASH = "7a82e3bbf133ecda7fccbe2be50a53e70a81bcb5f3db690dc29ea7a8006aace9c8e7c0d4ca4bc7aa422c9443f5d952b85d30eca85c8cedfa6de10cf1eb2afc44"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libheif gdk-pixbuf-loader-libheif(aarch-64) libpixbufloader-heif.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libheif.so.1()(64bit)"

inherit rpm
