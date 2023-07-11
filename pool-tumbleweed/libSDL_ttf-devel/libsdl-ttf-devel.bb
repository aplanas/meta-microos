SUMMARY = "Development files for the SDL TrueType library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.0.11"

RPM_NAME = "libSDL_ttf-devel-2.0.11-7.26.aarch64.rpm"
RPM_HASH = "55ddf17d60f1546e31a7e4d5cc0dc30b1bc7bac23f9c210e1de74a19269ffe44262e804a3de8fb111b035ad77674db16c51d0025f2c602f43163b8f818c99c78"

RPROVIDES:${PN} += "SDL-ttf-devel \
libSDL-ttf-devel \
pkgconfig-SDL-ttf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-ttf-2-0-0 \
pkgconfig-sdl"

inherit rpm
