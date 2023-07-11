SUMMARY = "Faithful transcription of the 1974 Atari Wumpus game"
DESCRIPTION = "WUMPUS is a bit of retrocomputing nostalgia. It is an *exact* clone, \
even down to the godawful user interface, of an ancient classic game. \
This version fixes two minor bugs in my original 1992 USENET posting \
of the source. Superhack is a structurally similar game with a \
different premise."
LICENSE = "BSD-2-Clause"

PV = "1.9"

RPM_NAME = "wumpus-1.9-1.3.aarch64.rpm"
RPM_HASH = "66c4a8374be9477ea0d607869c127c8caaa7f2c64192b829345aa533c9ebba58fd9c07346a2b89339196e583fcd26f7fbf8b905682c0958b12e5e147c3494b9c"

RPROVIDES:${PN} += "wumpus"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
