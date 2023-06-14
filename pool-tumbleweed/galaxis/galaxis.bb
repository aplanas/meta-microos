SUMMARY = "Clone of the nifty little Macintosh game"
DESCRIPTION = "GALAXIS for UNIX \
 \
Lifeboats from a crippled interstellar liner are adrift in a starfield. \
To find them, you can place probes that look in all eight compass \
directions and tell you how many lifeboats they see. If you drop a probe \
directly on a lifeboat it will be revealed immediately. Your objective: \
find the lifeboats as quickly as possible, before the stranded passengers \
run out of oxygen! \
 \
This is a UNIX-hosted, curses-based clone of the nifty little Macintosh \
freeware game Galaxis. It doesn't have the super-simple, point-and-click \
interface of the original, but compensates by automating away some of \
the game's simpler deductions."
LICENSE = "BSD-3-Clause"

PV = "1.10"

RPM_NAME = "galaxis-1.10-1.10.aarch64.rpm"
RPM_HASH = "6f3689252b034d3b710a910ec7a8c2d30517f6b09aac2b9049fcce86efd6f602932d663714e5edadadda1c3548f99e31519e82fefe5481c01ca5a7a744612663"

RPROVIDES:${PN} += "galaxis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
