SUMMARY = "Dedicated server for kajaani-kombat, a remake of the arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This subpackage includes the server binary."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-server-0.7-4.6.aarch64.rpm"
RPM_HASH = "9c9f174df7b39f9a76d8592ff7f39a9e3207e6cc30f981d5944df6534c266159050f183f898c32464076d03d90f16365bf9bff124ebb0f7d5dbd539a1752778b"

RPROVIDES:${PN} += "kajaani-kombat-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-net-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
