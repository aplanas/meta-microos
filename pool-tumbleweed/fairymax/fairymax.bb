SUMMARY = "A xboard compatible chess and chess-variant engine"
DESCRIPTION = "Fairymax is a program that plays chess and chess variants. It uses \
the xboard/winboard chess-engine protocol to communicate. Apart from \
'regular' chess (also known as the Mad-Queen variant), it can play \
Capablanca chess, gothic chess, knightmate, cylinder chess, berolina \
chess, superchess and courier chess."
LICENSE = "SUSE-Public-Domain"

PV = "5.0b"

RPM_NAME = "fairymax-5.0b-1.23.aarch64.rpm"
RPM_HASH = "4ca813820e0f5c25811485b218f793365386f069a2f4f37cf234d756b3ed3eccf908c14b87dcd5c1bf0a108b36e8dd490d40477b03f2d01226112cc13d38cc38"

RPROVIDES:${PN} += "chess-backend \
fairymax"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
