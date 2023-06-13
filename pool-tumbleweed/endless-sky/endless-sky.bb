SUMMARY = "Space exploration, trading, and combat game"
DESCRIPTION = "Explore other star systems. Earn money by trading, carrying passengers, \
or completing missions. Use your earnings to buy a better ship or to \
upgrade the weapons and engines on your current one. Blow up pirates. \
Take sides in a civil war. Or leave human space behind and hope to \
find some friendly aliens whose culture is more civilized than your own..."
LICENSE = "CC-BY-3.0 & CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-only"

PV = "0.9.16.1"

RPM_NAME = "endless-sky-0.9.16.1-1.1.aarch64.rpm"
RPM_HASH = "d1796703c6f81aedd302da6e71474f756d6db5f40d5c60899aee582e18972800d849769b58f78f8c0f2508c385ffbe1a5c477ed267771e9d4c5ef9328bbffdb5"

RPROVIDES:${PN} += "application() \
application(endless-sky.desktop) \
endless-sky \
endless-sky(aarch-64) \
metainfo() \
metainfo(io.github.endless_sky.endless_sky.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmad.so.0()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
