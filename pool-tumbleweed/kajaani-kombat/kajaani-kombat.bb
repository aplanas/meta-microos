SUMMARY = "A remake of the classic arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This package includes the client binary with built-in server."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-0.7-4.6.aarch64.rpm"
RPM_HASH = "f19d3378737203bc0355ac0a8570bc7c449ca9c368bd257b211963b2c3bc954e0d7e8c3bdea4e224119e1a2add80bfce1b55c4af530405c682581b5ba0c34fd2"

RPROVIDES:${PN} += "kajaani-kombat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-net-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
