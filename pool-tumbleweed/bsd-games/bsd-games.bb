SUMMARY = "Several Text-Mode Games"
DESCRIPTION = "This package provides these games: arithmetic, atc, \
backgammon, battlestar, bcd, bog, caesar, canfield, cfscores, cribbage, \
fish, fortune, hangman, hunt, mille, monop, morse, number, \
paranoia, pom, ppt, primes, rain, robots, sail, snake, snscore, \
teachgammon, trek, wargames, worm, worms, and wump."
LICENSE = "BSD-3-Clause"

PV = "2.17"

RPM_NAME = "bsd-games-2.17-122.21.aarch64.rpm"
RPM_HASH = "fad3ec6d05f9a884a8cbfa397ab399f83023ee3840dd67088519f6ea3c49402d4f740bac8023c58f1aa1fe0e8d45a894812fe11985250d6c45fa3e4b9d81b899"

RPROVIDES:${PN} += "bsd-games"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
user-games"

inherit rpm
