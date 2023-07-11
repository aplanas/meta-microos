SUMMARY = "X11 image viewer"
DESCRIPTION = "feh is an X11 image viewer aimed mostly at console users. It does not \
have a fancy GUI, but simply displays images. It is controlled via \
commandline arguments and configurable key/mouse actions. feh has \
multiple file modes using a slideshow or multiple windows. It \
supports the creation of montages as index prints with many \
user-configurable options."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "3.9.1"

RPM_NAME = "feh-3.9.1-2.3.aarch64.rpm"
RPM_HASH = "e25fa297f986e28737a1e9462228ac2422b620e48ec5a104c6339fb2340a67b27cfc7bfd69a0d931116a615168f41ece867d89200bb6c8ae23a6c5a0b6b8f972"

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
