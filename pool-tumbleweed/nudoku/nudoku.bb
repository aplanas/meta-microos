SUMMARY = "Ncurses based sudoku game"
DESCRIPTION = "nudoku is a ncurses based sudoku game."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "nudoku-2.1.0-1.10.aarch64.rpm"
RPM_HASH = "92db352b429bc7d0335bdf74c8e7286993dc7939b81f44ff9d8e9667197b78b2ca017906db96034cb893a2eb979ff3255c19447571000b7d67fd15da5ee00806"

RPROVIDES:${PN} += "nudoku \
nudoku(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm