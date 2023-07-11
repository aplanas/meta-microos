SUMMARY = "Two players, two castles, and a hill in between"
DESCRIPTION = "Ballerburg is a castle combat game. Two players (which can be human or \
computer-controlled) try to destroy the opponent's castle with their cannons. \
 \
Eckhard Kruse's original Ballerburg from 1987 ported to SDL."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "ballerburg-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "c74190da54c043a9c9bf5ac27aefd023c7910d8eb399eae1d6533357c891f0f2b48238f2741d7ec35b5f0b0f410531d9711710b79580fb11336993566b1a1280"

RPROVIDES:${PN} += "ballerburg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
