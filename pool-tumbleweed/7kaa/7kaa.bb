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

RPM_NAME = "7kaa-2.15.5-1.7.aarch64.rpm"
RPM_HASH = "b46228ab0b855db27767d9c612c5de48beda9298e7320b241ef12498a6dceb0e2377a0b396e9402d6bac7e67c82a60ae00225b65d8f61c8c02ba66489f6bcc11"

RPROVIDES:${PN} += "7kaa \
7kaa(aarch-64) \
application() \
application(7kaa.desktop)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
