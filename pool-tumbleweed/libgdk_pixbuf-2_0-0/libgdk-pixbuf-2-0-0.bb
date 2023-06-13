SUMMARY = "An image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "libgdk_pixbuf-2_0-0-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "6a25d87298dbb0652ac82d20775b99148f40e89cd6aa83d899a5977661c7161a6f5ca4b9e305d7c170c7c782cf925c4fb0dbb9e57380df596163cea4f2c9949b"

RPROVIDES:${PN} += "gdk-pixbuf \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdk_pixbuf-2_0-0 \
libgdk_pixbuf-2_0-0(aarch-64) \
libpixbufloader-ani.so()(64bit) \
libpixbufloader-bmp.so()(64bit) \
libpixbufloader-gif.so()(64bit) \
libpixbufloader-icns.so()(64bit) \
libpixbufloader-ico.so()(64bit) \
libpixbufloader-pnm.so()(64bit) \
libpixbufloader-qtif.so()(64bit) \
libpixbufloader-tga.so()(64bit) \
libpixbufloader-tiff.so()(64bit) \
libpixbufloader-xbm.so()(64bit) \
libpixbufloader-xpm.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
