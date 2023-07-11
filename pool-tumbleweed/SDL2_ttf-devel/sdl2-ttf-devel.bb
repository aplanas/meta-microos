SUMMARY = "Header files for the Simple DirectMedia Layer 2 Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.20.2"

RPM_NAME = "SDL2_ttf-devel-2.20.2-1.4.aarch64.rpm"
RPM_HASH = "b2f0ef4f9345b69dd47c27aa54891d855217f878c155a5cf58fe3cc97c6602d50543dbfbdb7250ff31029e858812d9eb09cd0631b40d389f1d436490aafb052e"

RPROVIDES:${PN} += "SDL2-ttf-devel \
libSDL2-ttf-devel \
pkgconfig-SDL2-ttf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-ttf-2-0-0 \
pkgconfig-sdl2"

inherit rpm
