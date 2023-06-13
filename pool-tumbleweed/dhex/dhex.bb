SUMMARY = "Hexeditor with a Diff-mode for ncurses"
DESCRIPTION = "DHEX is just another Hexeditor with a Diff mode for ncurses. It makes \
heavy use of colors and is themeable."
LICENSE = "GPL-2.0-or-later"

PV = "0.69"

RPM_NAME = "dhex-0.69-1.17.aarch64.rpm"
RPM_HASH = "6cb7b573500e787745ee45b5c813f1dc7886a3b4b7ce0b56c214b904b0811f0e47b795116a4221ab596bb79a2bd06233bdb47a295956106b722507d0f9c3c3eb"

RPROVIDES:${PN} += "dhex \
dhex(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
