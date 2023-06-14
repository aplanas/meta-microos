SUMMARY = "Development files for the SDL2 networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "2.2.0"

RPM_NAME = "SDL2_net-devel-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "21a60ec6aff029342b60d0f0807db1e8ea818920898af92bc19dd8d0f64162580d08d804e392643cf98821cce38b5c312cc3833e5e7029ef246a7597dc185586"

RPROVIDES:${PN} += "SDL2-net-devel \
libSDL2-net-devel \
pkgconfig-SDL2-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-net-2-0-0 \
pkgconfig-sdl2"

inherit rpm
