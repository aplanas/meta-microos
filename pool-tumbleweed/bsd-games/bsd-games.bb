SUMMARY = "Several Text-Mode Games"
DESCRIPTION = "This package provides these games: arithmetic, atc, \
backgammon, battlestar, bcd, bog, caesar, canfield, cfscores, cribbage, \
fish, fortune, hangman, hunt, mille, monop, morse, number, \
paranoia, pom, ppt, primes, rain, robots, sail, snake, snscore, \
teachgammon, trek, wargames, worm, worms, and wump."
LICENSE = "BSD-3-Clause"

PV = "2.17"

RPM_NAME = "bsd-games-2.17-122.20.aarch64.rpm"
RPM_HASH = "35e8c517a952c3b7a25ef3f523cb1ba69559b731baba6c8850e3cc9ee2c69ee7f1f9022394132d58a82c868707000dcff43c422d0c82cebfa4d1d830c9ac0497"

RPROVIDES:${PN} += "bsd-games"

RDEPENDS:${PN} += "/bin/sh \
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
