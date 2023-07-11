SUMMARY = "Seven Kingdoms: Ancient Adversaries"
DESCRIPTION = "Seven Kingdoms made departures from the traditional real-time strategy models \
of 'gather resources, build a base and army, and attack'. The economic model \
bears more resemblance to a turn-based strategy game. It features an espionage \
system that allows players to train and control spies individually, who each \
have a spying skill that increases over time. The player is also responsible \
for catching spies in their own kingdom. Inns built within the game allow \
players to hire mercenaries of various occupations, skill levels, and races. \
Skilled spies of enemy races are essential to a well-conducted espionage \
program, and the player can bolster his forces by grabbing a skilled fighter \
or give ones own factories, mines, and towers of science, a boost by hiring a \
skilled professional. \
 \
Enlight Software decided to release the game to the Open Source community \
in August 2009. At that time everything, but the music, was released under \
the GPL v2."
LICENSE = "GPL-2.0-only"

PV = "2.15.5"

RPM_NAME = "7kaa-2.15.5-1.8.aarch64.rpm"
RPM_HASH = "9533b6859f44d75e32a376f7ebe1b071683e70bdb6205b243660d1c8300888d3dacc6a975ff21c8715bc55fc98e9039df725c960bfd8349f443de4f28475edfe"

RPROVIDES:${PN} += "7kaa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6"

inherit rpm
