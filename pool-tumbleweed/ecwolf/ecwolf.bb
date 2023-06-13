SUMMARY = "An opensource implementation of Wolfenstein3D engine"
DESCRIPTION = "ECWolf is a port of the Wolfenstein 3D engine based of Wolf4SDL."
LICENSE = "GPL-2.0-only"

PV = "1.4.1"

RPM_NAME = "ecwolf-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "919128d4cdc61744bd3b5a0a4f5436f7a998eabba049e69d762e95e5968108132dcace727fa7a423a0e5b68c1487876b9113ef5b69c98445abacd62ca247686d"

RPROVIDES:${PN} += "bundled(gdtoa) \
bundled(lzma) \
ecwolf \
ecwolf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_net-2.0.so.0()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
