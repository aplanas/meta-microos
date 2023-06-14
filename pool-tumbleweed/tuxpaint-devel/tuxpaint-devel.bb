SUMMARY = "Devel files of tuxpaint"
DESCRIPTION = "Header files and development documentation for tuxpaint."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.28"

RPM_NAME = "tuxpaint-devel-0.9.28-1.1.aarch64.rpm"
RPM_HASH = "eae1577a7ebb1ec432506195168282b13674e09a93ff768ad762b581b06e21fc650d4722001e5b1f7375a4e17662d82b40831ca176bfcb2a60b3d30cd88e60d7"

RPROVIDES:${PN} += "tuxpaint-devel"

RDEPENDS:${PN} += "/bin/sh \
gcc-c++ \
gettext-devel \
libpaper-devel \
libpng-devel \
pkgconfig-SDL2-Pango \
pkgconfig-SDL2-image \
pkgconfig-SDL2-mixer \
pkgconfig-SDL2-ttf \
pkgconfig-fribidi \
pkgconfig-librsvg-2.0 \
pkgconfig-sdl2 \
pkgconfig-zlib \
tuxpaint"

inherit rpm
