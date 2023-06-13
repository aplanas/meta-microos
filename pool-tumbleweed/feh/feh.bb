SUMMARY = "X11 image viewer"
DESCRIPTION = "feh is an X11 image viewer aimed mostly at console users. It does not \
have a fancy GUI, but simply displays images. It is controlled via \
commandline arguments and configurable key/mouse actions. feh has \
multiple file modes using a slideshow or multiple windows. It \
supports the creation of montages as index prints with many \
user-configurable options."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "3.9.1"

RPM_NAME = "feh-3.9.1-2.2.aarch64.rpm"
RPM_HASH = "a8a3e0125188129d84402aff13c478a4b91769cac1ea1efa1fde21a0daab2630e12b74f756f9c12070787998a578c61334ed945ecbc6de54178898fb4582e45a"

RPROVIDES:${PN} += "application() \
application(feh.desktop) \
feh \
feh(aarch-64) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/heic) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/jxl) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/webp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap)"

RDEPENDS:${PN} += "desktop-file-utils \
hicolor-icon-theme \
imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libexif.so.12()(64bit) \
libjpeg-turbo \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
