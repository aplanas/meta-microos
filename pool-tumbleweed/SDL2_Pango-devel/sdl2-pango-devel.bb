SUMMARY = "Headers and sources for developing apps with SDL2_Pango"
DESCRIPTION = "SDL2_Pango is a library for graphically rendering internationalized and tagged \
text in SDL2 using TrueType fonts. SDL2_Pango is a port of SDL_Pango to SDL2. \
 \
This package provides the headers and sources for developing applications with \
SDL2_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.5"

RPM_NAME = "SDL2_Pango-devel-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "f2a239a51c978dee291646307365f11f21468229ebceb7cd82ba8840320da34697be416787d17da812237cc405e9c4ab96e7a2c62a67a1975a96c0aa202d1710"

RPROVIDES:${PN} += "SDL2-Pango-devel \
pkgconfig-SDL2-Pango"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-Pango4 \
pkgconfig-freetype2 \
pkgconfig-pango \
pkgconfig-sdl2"

inherit rpm
