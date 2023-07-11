SUMMARY = "Libraries, includes and more to develop SDL2_gfx applications"
DESCRIPTION = "Library containing 20+ graphics primitives (line, box, circle, polygon, etc.) for SDL2."
LICENSE = "Zlib"

PV = "1.0.4"

RPM_NAME = "libSDL2_gfx-devel-1.0.4-2.8.aarch64.rpm"
RPM_HASH = "f7c0e5d25fcccf304d40206eff06a46913c2ea2d2b11d400239132432f59fc21ab2a60f014ec06abee4e1f5643e2157e29b1cf75a14e09b25a212bf5d4092812"

RPROVIDES:${PN} += "SDL2-gfx-devel \
libSDL2-gfx-devel \
pkgconfig-SDL2-gfx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-gfx-1-0-0 \
pkgconfig-sdl2"

inherit rpm
