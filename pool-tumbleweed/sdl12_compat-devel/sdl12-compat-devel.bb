SUMMARY = "Libraries, includes and more to develop SDL-1.2 applications"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "sdl12_compat-devel-1.2.64-1.5.aarch64.rpm"
RPM_HASH = "3faf0dd1845fdb69a8322193d2a45c2c2a3dd5be3656a58d6a165aa5e46db6aa3a1caad47d705dc119100481549febc91e785a47fac8c452fa6feccb94d3e768"

RPROVIDES:${PN} += "SDL-devel \
libSDL-devel \
pkgconfig-sdl \
pkgconfig-sdl12-compat \
sdl12-compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libSDL-1-2-0 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm
