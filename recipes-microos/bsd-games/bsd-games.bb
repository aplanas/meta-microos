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

RPROVIDES:${PN} += "bsd-games bsd-games(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(games) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfl.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) user(games)"

inherit rpm
