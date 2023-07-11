SUMMARY = "Development files for the SDL2 networking library"
DESCRIPTION = "This is a networking library for use with SDL."
LICENSE = "Zlib"

PV = "2.2.0"

RPM_NAME = "SDL2_net-devel-2.2.0-1.3.aarch64.rpm"
RPM_HASH = "bdd3a9032c9080873924399bb4136f7b7c2e81fd7b300da07da0af46e9415930c031c508e9c2ffeeec02cfdd4fda912b8210ac69292935e61bdda6a91f1d55aa"

RPROVIDES:${PN} += "SDL2-net-devel \
libSDL2-net-devel \
pkgconfig-SDL2-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL2-net-2-0-0 \
pkgconfig-sdl2"

inherit rpm
