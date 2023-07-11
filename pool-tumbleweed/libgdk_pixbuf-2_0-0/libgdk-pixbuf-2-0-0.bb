SUMMARY = "An image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "libgdk_pixbuf-2_0-0-2.42.10-1.5.aarch64.rpm"
RPM_HASH = "f7f8ac2b9d586652419ec527c713b467ccb39a6393175c2935aa5de941f56755bc3d73cdde592fac4f1019f6a3aff457a6ec7a7d6bda2286f4965e2e9a5d919e"

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

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
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
