SUMMARY = "Ncurses based sudoku game"
DESCRIPTION = "nudoku is a ncurses based sudoku game."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "nudoku-2.1.0-1.11.aarch64.rpm"
RPM_HASH = "47c2d217b1aff6aa702cad19b6e48ff4a0cb67f379a5126b6865023dc2a2c8bb3d5f6777d802128d873179bf33301f0ba878b2ebfa4729e903d26aa6f08e3613"

RPROVIDES:${PN} += "nudoku"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
