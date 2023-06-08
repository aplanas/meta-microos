SUMMARY = "Emulates a braille display"
DESCRIPTION = "Brlemu emulates a braille display. It is intended for testing braille \
support without needing to acquire expensive hardware devices."
LICENSE = "GPL-2.0"

PV = "0.1"

RPM_NAME = "brlemu-0.1-61.21.aarch64.rpm"
RPM_HASH = "cce451f2f2ce261c42cbf36a6982620eb296364b357a1c67d8906030d395b36e4e968a07fd740a0d2d016629ff239740e71f5b96e76711b4b5845db85a6b8dd2"

RPROVIDES:${PN} += "brlemu brlemu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
