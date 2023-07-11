SUMMARY = "Game engine for action RPGs"
DESCRIPTION = "Solarus is a 2D game engine written in C++, and it executes games \
made in Lua. It is designed with 16-bit classic action RPGs in \
mind. \
 \
This package contains the 'solarus-run' executable required to run \
games based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-1.6.5-2.16.aarch64.rpm"
RPM_HASH = "c8c0671613b773cb53882871d1528c94aa171c253212b3303fc2b2b584a1d97eed38f10263dfb2ffc653bef264393ba194d3e7dc07bd22a9bd9b93a5c11a4cab"

RPROVIDES:${PN} += "solarus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsolarus.so.1 \
libstdc++.so.6"

inherit rpm
