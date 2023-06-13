SUMMARY = "SDL2 Library Developer Files"
DESCRIPTION = "This package contains files needed for development with the SDL2 \
library."
LICENSE = "Zlib"

PV = "2.26.5"

RPM_NAME = "SDL2-devel-2.26.5-1.1.aarch64.rpm"
RPM_HASH = "a203e73ba73f0de110f63b1a410ee4c5b96b8bce4c35ef72b6a353c7f7f623b5f2a7e17431a0d03661cfcfa76a3ca9e91c7c6958680147c84d150202881c226a"

RPROVIDES:${PN} += "SDL2-devel \
SDL2-devel(aarch-64) \
cmake(sdl2) \
libSDL2-devel \
pkgconfig(sdl2)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
c_compiler \
libSDL2-2_0-0 \
pkgconfig \
pkgconfig(gl) \
pkgconfig(glesv1_cm) \
pkgconfig(glesv2) \
pkgconfig(glu) \
pkgconfig(x11) \
pkgconfig(xproto)"

inherit rpm
