SUMMARY = "An image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "libgdk_pixbuf-2_0-0-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "6a25d87298dbb0652ac82d20775b99148f40e89cd6aa83d899a5977661c7161a6f5ca4b9e305d7c170c7c782cf925c4fb0dbb9e57380df596163cea4f2c9949b"

RPROVIDES:${PN} += "gdk-pixbuf \
libgdk-pixbuf-2-0-0 \
libgdk-pixbuf-2.0.so.0 \
libpixbufloader-ani.so \
libpixbufloader-bmp.so \
libpixbufloader-gif.so \
libpixbufloader-icns.so \
libpixbufloader-ico.so \
libpixbufloader-pnm.so \
libpixbufloader-qtif.so \
libpixbufloader-tga.so \
libpixbufloader-tiff.so \
libpixbufloader-xbm.so \
libpixbufloader-xpm.so"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
