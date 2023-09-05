SUMMARY = "SDL2 Library Developer Files"
DESCRIPTION = "This package contains files needed for development with the SDL2 \
library."
LICENSE = "Zlib"

PV = "2.28.3"

RPM_NAME = "SDL2-devel-2.28.3-1.1.aarch64.rpm"
RPM_HASH = "13db3d20e554c9bcfe5c286a99fa829a83ec337e39c13bbff88e05b450a20a8ae2ba37e6ba89847c65aa524c494493f77d3fc85eaa95c6cc083b712b5d155697"

RPROVIDES:${PN} += "SDL2-devel \
cmake-sdl2 \
libSDL2-devel \
pkgconfig-sdl2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
c-compiler \
libSDL2-2-0-0 \
pkgconfig \
pkgconfig-gl \
pkgconfig-glesv1-cm \
pkgconfig-glesv2 \
pkgconfig-glu \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm
