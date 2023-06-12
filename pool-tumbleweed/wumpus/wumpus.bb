SUMMARY = "Faithful transcription of the 1974 Atari Wumpus game"
DESCRIPTION = "WUMPUS is a bit of retrocomputing nostalgia. It is an *exact* clone, \
even down to the godawful user interface, of an ancient classic game. \
This version fixes two minor bugs in my original 1992 USENET posting \
of the source. Superhack is a structurally similar game with a \
different premise."
LICENSE = "BSD-2-Clause"

PV = "1.9"

RPM_NAME = "wumpus-1.9-1.2.aarch64.rpm"
RPM_HASH = "bd2850dde929f5845f59ebb4b22687ec65c25de2eed945c7e3183ab677a70648feac5d3170725648c42827b666f09de392e0a679dbc8ce4ac166f9d64d56a695"

RPROVIDES:${PN} += "application() \
application(superhack.desktop) \
application(wumpus.desktop) \
wumpus \
wumpus(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
