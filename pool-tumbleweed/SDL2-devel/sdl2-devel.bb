SUMMARY = "SDL2 Library Developer Files"
DESCRIPTION = "This package contains files needed for development with the SDL2 \
library."
LICENSE = "Zlib"

PV = "2.28.1"

RPM_NAME = "SDL2-devel-2.28.1-1.1.aarch64.rpm"
RPM_HASH = "e3207b83d1338906485fe71390b7cce9c6628c95a5ceb261f9fad4796a89b178d1c5f56bf25a1f0aca37e2a07bb03657313e4a4a1f66d60e399e914a91710cf0"

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
