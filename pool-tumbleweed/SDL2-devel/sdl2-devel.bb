SUMMARY = "SDL2 Library Developer Files"
DESCRIPTION = "This package contains files needed for development with the SDL2 \
library."
LICENSE = "Zlib"

PV = "2.28.2"

RPM_NAME = "SDL2-devel-2.28.2-1.1.aarch64.rpm"
RPM_HASH = "6fb75a540b33ce653cc37578d12cfd6490fd00dd720b013190c36baba36f50ead3adc891c8e48955a23f8f72806a3ba9f33cd4d9381e805a96799aa273f32c67"

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
