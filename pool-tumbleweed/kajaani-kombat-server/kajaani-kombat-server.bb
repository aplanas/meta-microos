SUMMARY = "Dedicated server for kajaani-kombat, a remake of the arcade game Rampart"
DESCRIPTION = "A remake of the classis arcade game Rampart, with the change \
of the medieval world to a space-world. \
Playable on one machine but also over the net with 2-4 players (2 players \
may always use the same machine). \
 \
This subpackage includes the server binary."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "kajaani-kombat-server-0.7-4.7.aarch64.rpm"
RPM_HASH = "04d478405a9584a8be3502a969891924a93f5260a9be9825eb599e581d4aae6b3ce4bbfb9a5424ce3a22188acd8effaceb97e1f2e00cb8c97274f853132d2fda"

RPROVIDES:${PN} += "kajaani-kombat-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-net-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
