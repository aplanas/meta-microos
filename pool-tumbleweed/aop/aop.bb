SUMMARY = "Ncurses based arcade game with only 64 lines of code"
DESCRIPTION = "Ambassador of Pain is a curses based arcade game for Linux/UNIX \
with only 64 lines of sourcecode. \
 \
The goal is to drive the hoovercraft (O) trough the level into \
the 'at' sign (@) and reach as much points as possible by reducing \
the number of moves and don't losing any time. \
Lost lifes (0) can easily be picked up by simply drive over them."
LICENSE = "GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "aop-0.6-2.8.aarch64.rpm"
RPM_HASH = "7afa86ce980fc2d84bd8b565e847285e704acf02e6ed081fc33cdad0c28bf38c045c793aaeff472a3d25a7c480062a9645989410205d7ffbd8d222b3c37b0705"

RPROVIDES:${PN} += "aop \
aop(aarch-64) \
application() \
application(aop.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
