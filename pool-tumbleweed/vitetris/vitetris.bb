SUMMARY = "Terminal-based Tetris clone"
DESCRIPTION = "Vitetris is a terminal-based Tetris game. It can be played by one or \
two players, over the network or on the same keyboard. \
 \
Vitetris comes with customizable appearance and netplay where both \
players can choose difficulty (level and height). (No sound, though.) \
 \
Rotation, scoring, levels and speed resembles the early Tetris \
games by Nintendo, with the addition of a short lock delay which \
makes it possible to play at higher levels. (It does not make it \
possible to prevent the piece from ever locking by abusing lock delay \
resets.)"
LICENSE = "BSD-2-Clause"

PV = "0.59.1"

RPM_NAME = "vitetris-0.59.1-1.12.aarch64.rpm"
RPM_HASH = "aacdec508dbf1d32088a180d40c416b8235ecd08d1c61a8ae811b9ab1c454cbf6f8c0ea9cf53e378cc28b5cf66921301f66a7bafa3715fb564e74f0505902a4d"

RPROVIDES:${PN} += "vitetris"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
