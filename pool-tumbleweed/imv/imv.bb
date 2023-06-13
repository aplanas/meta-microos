SUMMARY = "Image viewer for X11/Wayland"
DESCRIPTION = "imv is a command line image viewer intended for use with tiling window managers."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "4.4.0"

RPM_NAME = "imv-4.4.0-1.4.aarch64.rpm"
RPM_HASH = "b85af39c1a1aa5f6f489f180bfad2707426b0a142457daea8f2b624a696d8f0163c45b96f5f3f570db3936d76d41cde0cd8e3305b9d4d351abfba2a54e95cef4"

RPROVIDES:${PN} += "application() \
application(imv-dir.desktop) \
application(imv.desktop) \
imv \
imv(aarch-64) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/heif) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreeimage.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libheif.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libinih.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libturbojpeg.so.0()(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) \
libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
