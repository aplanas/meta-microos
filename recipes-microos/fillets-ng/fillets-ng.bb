SUMMARY = "Fish Fillets - Next Generation"
DESCRIPTION = "Fish Fillets is strictly a puzzle game. The goal in each of the 70 \
levels is always the same: find a safe way out. The fish utter witty \
remarks about their surroundings and the various inhabitants of their \
underwater realm quarrel among themselves or comment on the efforts of \
your fish. The whole game is accompanied by quiet, comforting music."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "fillets-ng-1.0.1-4.18.aarch64.rpm"
RPM_HASH = "b753dd44c517c111c3d46e0447935554d268a0022fc172300ecfb4b43ff1d5aaf3486f849583634732a739c540d4a901e63a719b4548a7ef80fb3f650e721da0"

RPROVIDES:${PN} += "application() \
application(fillets-ng.desktop) \
fillets-ng \
fillets-ng(aarch-64)"
RDEPENDS:${PN} += "fillets-ng-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libSDL_ttf-2.0.so.0()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfribidi.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
