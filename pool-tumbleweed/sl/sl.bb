SUMMARY = "Steam Locomotive in ASCII art"
DESCRIPTION = "'sl' displays a steam locomotive running across the terminal. \
It is a joke command intended to catch any mistypings of 'ls'."
LICENSE = "ISC"

PV = "5.02"

RPM_NAME = "sl-5.02-2.12.aarch64.rpm"
RPM_HASH = "8e348033611631073b64a4b9b485d0d149f848f624feae3a8ec2a7d20922e74247bad87cb477ffa53d3dc68b7a45eb72a4e486507bbafccb51a83fe17d72a237"

RPROVIDES:${PN} += "sl \
sl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
