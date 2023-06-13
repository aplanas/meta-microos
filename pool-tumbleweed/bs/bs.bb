SUMMARY = "Battleships solitaire game with a color interface"
DESCRIPTION = "The classic game of Battleships against the computer. Uses character-cell \
graphics with a visual point-and-shoot interface. If you're using an xterm \
under Linux the mouse will work."
LICENSE = "BSD-3-Clause"

PV = "2.11"

RPM_NAME = "bs-2.11-1.10.aarch64.rpm"
RPM_HASH = "7b77e9498f8af032c5384c55cc607a916e2a09b1e7e6e2b354e2f829ce6afbe9f7822561d6cab6dd9cf95fb0e8c5a068cb42d403d06c9fabc667f746c34d8af6"

RPROVIDES:${PN} += "application() \
application(bs.desktop) \
bs \
bs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
