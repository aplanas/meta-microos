SUMMARY = "Libraries, includes and more to develop SDL-1.2 applications"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "sdl12_compat-devel-1.2.64-1.4.aarch64.rpm"
RPM_HASH = "119760483a27efdb1c916e0e436881db5acd3e1d6e7d8f06bf37d620653a3d91ec779632afa11eb585926b1bc6890e2978084d7cea3628b82d0cf029e1efe8d6"

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
