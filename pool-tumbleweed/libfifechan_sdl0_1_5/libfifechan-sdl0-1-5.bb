SUMMARY = "SDL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "SDL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_sdl0_1_5-0.1.5-1.19.aarch64.rpm"
RPM_HASH = "d6bb70106f791c44588b19103106eae46a197025c4b01c9d989283ff9af61a3c8a26e87ccb08d896a207a9794a47f58f34ed6f3699926b6650d18d98b527cf1d"

RPROVIDES:${PN} += "libfifechan_sdl.so.0.1.5()(64bit) \
libfifechan_sdl0_1_5 \
libfifechan_sdl0_1_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfifechan.so.0.1.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
