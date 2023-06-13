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

RPROVIDES:${PN} += "application() \
application(qiv.desktop) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/tiff) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-gray) \
mimehandler(image/x-icb) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
qiv \
qiv(aarch-64)"

RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libexif.so.12()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libmagic.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
