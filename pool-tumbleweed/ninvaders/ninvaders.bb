SUMMARY = "A space invaders-like game using ncurses"
DESCRIPTION = "A Space Invaders type game with text-only graphics."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "ninvaders-0.1.1-2.11.aarch64.rpm"
RPM_HASH = "5645fd53aecf718fb69092d314f7e36754ba21786457c1050d76eefdf60d3cdfd5b09cffb3a13ba1c13df686437634c0adcacb3e2d86d59ab96680ec97d046e8"

RPROVIDES:${PN} += "ninvaders \
ninvaders(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
