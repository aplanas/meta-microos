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

RPROVIDES:${PN} += "feh"

RDEPENDS:${PN} += "desktop-file-utils \
hicolor-icon-theme \
imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libc.so.6 \
libcurl.so.4 \
libexif.so.12 \
libjpeg-turbo \
libm.so.6 \
libpng16.so.16"

inherit rpm
