SUMMARY = "Roguelike dungeon exploration game"
DESCRIPTION = "Crawl is a fun game in the grand tradition of games like Rogue, Hack, and Moria. \
Your objective is to travel deep into a subterranean cave complex and retrieve the Orb of Zot, \
which is guarded by many horrible and hideous creatures. \
 \
This is the Stone Soup version of Dungeon Crawl. \
 \
Note: You need to be in the 'games' group in order to play the game."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "crawl-0.28.0-1.5.aarch64.rpm"
RPM_HASH = "a575691540bfba6f1dfb3803f8ab05b48d75b8df6c0aec00ac1d162d0411f48f8742c40180728c6e10fb78a009b0dfc0d24777a37e47b884496d7f91284bc5f9"

RPROVIDES:${PN} += "crawl crawl(aarch-64)"
RDEPENDS:${PN} += "/bin/sh crawl-data group(games) libGL.so.1()(64bit) libGLU.so.1()(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) libSDL2_image-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblua5.1.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) user(games)"

inherit rpm
