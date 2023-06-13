SUMMARY = "Development files for the SDL TrueType library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.0.11"

RPM_NAME = "libSDL_ttf-devel-2.0.11-7.25.aarch64.rpm"
RPM_HASH = "c8956a4fbda1675c098871f755292ba3ce776e8c7ef378bd80d94bd6069aec2cda5e1e0bb7d08af87a48be3f15800e22906f6b70c03e14e4dcb334b7a8752cef"

RPROVIDES:${PN} += "SDL_ttf-devel \
libSDL_ttf-devel \
libSDL_ttf-devel(aarch-64) \
pkgconfig(SDL_ttf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL_ttf-2_0-0 \
pkgconfig(sdl)"

inherit rpm
