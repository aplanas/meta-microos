SUMMARY = "A xboard compatible chess and chess-variant engine"
DESCRIPTION = "Fairymax is a program that plays chess and chess variants. It uses \
the xboard/winboard chess-engine protocol to communicate. Apart from \
'regular' chess (also known as the Mad-Queen variant), it can play \
Capablanca chess, gothic chess, knightmate, cylinder chess, berolina \
chess, superchess and courier chess."
LICENSE = "SUSE-Public-Domain"

PV = "5.0b"

RPM_NAME = "fairymax-5.0b-1.22.aarch64.rpm"
RPM_HASH = "eb58bf5b8835b36805a30efbc3c9125a702e737c380607a081b3e6f64c0de2370bd839abf191aa053fe9cceb0da63e3aa5e134ab48eb582dbdcdc383630a9325"

RPROVIDES:${PN} += "chess_backend \
fairymax \
fairymax(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
