SUMMARY = "A brick breaking game"
DESCRIPTION = "A brick breaker with 50 levels of game and 11 special levels, \
distributed on the 2 modes of game to give the player a sophisticated system \
of attack weapons with an enormous firepower that can be built by \
gaining bonuses.  Numerous decors, music and sounds complete this \
game. This game was ported from the Commodore Amiga."
LICENSE = "GPL-3.0-only"

PV = "0.93.1"

RPM_NAME = "tecnoballz-0.93.1-5.1.aarch64.rpm"
RPM_HASH = "a0b29ce2e8af67b6eff8db5ed5fa9a26ba6b499503593312aec8b84178bc8f9b85dde7c9e982efe5916bf3bfebf35cf2a02a4020c61b2d53958966cdb92ceb74"

RPROVIDES:${PN} += "application() \
application(tecnoballz.desktop) \
tecnoballz \
tecnoballz(aarch-64)"
RDEPENDS:${PN} += "libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmikmod.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinyxml.so.0()(64bit)"

inherit rpm
