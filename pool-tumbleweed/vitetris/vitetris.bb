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

RPM_NAME = "vitetris-0.59.1-1.11.aarch64.rpm"
RPM_HASH = "58a52168b5a00370eaa010049eaba0a2ab9d8e66b729f2a3e23f9d4fca16e84c447ca43b087097ee43ed503a4eedf56d23946af7beeaf00f814f495476085623"

RPROVIDES:${PN} += "application() \
application(vitetris.desktop) \
vitetris \
vitetris(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
