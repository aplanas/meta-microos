SUMMARY = "Detour Tile Cache Library for Recastnatnaviagtion"
DESCRIPTION = "This package contains the detour tile cache library part of Recastnatnaviagtion."
LICENSE = "Zlib"

PV = "1.5.1+git20210305.c5cbd53"

RPM_NAME = "libDetourTileCache1-1.5.1+git20210305.c5cbd53-1.8.aarch64.rpm"
RPM_HASH = "7afaed99e65174c6566825d3d645052dcb8244271f32fbad2f41afa99471fd5c202757ce01343a227c9cb03850cd614d27e11f1c4e998eadf66fc99a578cd83a"

RPROVIDES:${PN} += "libDetourTileCache.so.1 \
libDetourTileCache1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libDetour.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
