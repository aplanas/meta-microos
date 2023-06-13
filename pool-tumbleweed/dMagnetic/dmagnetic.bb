SUMMARY = "An interpreter for Magnetic Scrolls games"
DESCRIPTION = "An interpreter for games produced by the studio Magnetic Scrolls. It \
can be used to play 'The Pawn', 'The Guild of Thieves', 'Jinxter', \
'Fish!', 'Myth', 'Corruption' and 'Wonderland'."
LICENSE = "BSD-2-Clause"

PV = "0.36"

RPM_NAME = "dMagnetic-0.36-1.1.aarch64.rpm"
RPM_HASH = "b5e8dbd42f3675993a6e0a2d46dc13b87ce5b19c38d40d9566925912925fd41f5329677de76fe22ad45509229e7696f9b412856d2bca13ef25f2c62ce618bc73"

RPROVIDES:${PN} += "dMagnetic \
dMagnetic(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
