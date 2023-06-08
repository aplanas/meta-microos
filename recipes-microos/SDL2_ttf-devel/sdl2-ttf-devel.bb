SUMMARY = "Header files for the Simple DirectMedia Layer 2 Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.20.2"

RPM_NAME = "SDL2_ttf-devel-2.20.2-1.3.aarch64.rpm"
RPM_HASH = "20f20575f5c616712e68914978ba473aadbbb1d702b699c7c1f246141338a2ebea4164085df32d4583c350ff930af9122a7d9772bd8e1e5770a2acc8083f3344"

RPROVIDES:${PN} += "SDL2_ttf-devel SDL2_ttf-devel(aarch-64) libSDL2_ttf-devel pkgconfig(SDL2_ttf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSDL2_ttf-2_0-0 pkgconfig(sdl2)"

inherit rpm
