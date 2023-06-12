SUMMARY = "Console based Tetris clone"
DESCRIPTION = "A colorized, small and flexible Tetris clone for the console."
LICENSE = "GPL-2.0-or-later"

PV = "0.42.1"

RPM_NAME = "ctris-0.42.1-2.11.aarch64.rpm"
RPM_HASH = "eaf23d78cccdf7c485e2c130d5addfa71e8ae69a3243e16172f318b7ef34d6efce936ddc4afbf7c08220bb329f0e3ddbddcd8dbd34ef62ccfa8410a8dbc4d53e"

RPROVIDES:${PN} += "ctris \
ctris(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
