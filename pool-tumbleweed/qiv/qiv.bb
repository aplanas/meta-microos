SUMMARY = "A gdk/imlib based image viewer"
DESCRIPTION = "The 'Quick Image Viewer' (qiv) is a GDK/Imlib image viewer similar to \
viewers like xv or xloadimage. qiv features setting an image as an \
x11 background with a user-definable background color, fullscreen \
viewing, a screensaver mode, brightness/contrast/gamma correction, \
real transparency, zoom and slideshow. \
 \
It creates only one window, containing only the image to view."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "qiv-2.3.3-1.1.aarch64.rpm"
RPM_HASH = "7a9ca6628363f7f62c2a62de5e7d190bdb13a8b716e2ecfe2115a82c6304f869bdb1421722a3965cc74ab2f2ef268f4b6edb1664b3bbdb8a18e441c8c1be739e"

RPROVIDES:${PN} += "qiv"

RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libmagic.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtiff.so.6"

inherit rpm
