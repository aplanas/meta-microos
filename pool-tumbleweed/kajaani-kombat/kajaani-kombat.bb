SUMMARY = "A remake of the classic arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This package includes the client binary with built-in server."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-0.7-4.7.aarch64.rpm"
RPM_HASH = "b0424aebedf54b3e866718764d4cb6517159c7bd7058901668a0950ef7c7264e25f5b97af74b9c45d9df1af00bb065033abc4b92b3394f1470aabb32c624ea87"

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
