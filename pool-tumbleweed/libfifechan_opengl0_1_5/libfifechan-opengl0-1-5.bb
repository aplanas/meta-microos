SUMMARY = "OpenGL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "OpenGL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_opengl0_1_5-0.1.5-1.19.aarch64.rpm"
RPM_HASH = "c3d9c05580dd04605fb5748552563854be0abb01800d7aec186bb58574cdc31f14b4ecfcb38820db7e04d00a61eb76e89c99f89e8070709e3bb1b670819e9da7"

RPROVIDES:${PN} += "libfifechan_opengl.so.0.1.5()(64bit) \
libfifechan_opengl0_1_5 \
libfifechan_opengl0_1_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfifechan.so.0.1.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
