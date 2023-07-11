SUMMARY = "Libraries, includes and more to develop SDL-1.2 applications"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "sdl12_compat-devel-1.2.64-1.3.aarch64.rpm"
RPM_HASH = "3f4d6cc31d0d22b9a4df7d77da001e1be9617626dd6bb9d70ac3de06b644947e88311940cccb40c3d8483a2c3c56bc591223e8415b1ec7377b5a5d5af3e258cf"

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
