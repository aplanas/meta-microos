SUMMARY = "A Bomberman clone"
DESCRIPTION = "This is an SDL2 version of the original 1999 version of Mr. Boom. \
The goal of the game is to bomb away enemies and other players."
LICENSE = "MIT"

PV = "4.9"

RPM_NAME = "mrboom-4.9-1.15.aarch64.rpm"
RPM_HASH = "54660543dded1f30b068393c8abd714de404896c4edd19fda08722a6b762cbf42347ec952249a4d56ff28f162262c66138d3938fa77838bdaa8df20aca25f304"

RPROVIDES:${PN} += "application() \
application(mrboom.desktop) \
mrboom \
mrboom(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libminizip.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit)"

inherit rpm
