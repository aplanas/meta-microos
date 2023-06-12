SUMMARY = "Boost.Math runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_math1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "9d011204c8e48e32109620c032fcdcc6369f8485870d7d4645548833a70d3d2649f0c4da5ca2fb7adf5e4aa091a7da9f550baeb8d1e481139085d10aa2f9e31d"

RPROVIDES:${PN} += "libboost_math1_82_0 \
libboost_math1_82_0(aarch-64) \
libboost_math_c99.so.1.82.0()(64bit) \
libboost_math_c99f.so.1.82.0()(64bit) \
libboost_math_c99l.so.1.82.0()(64bit) \
libboost_math_tr1.so.1.82.0()(64bit) \
libboost_math_tr1f.so.1.82.0()(64bit) \
libboost_math_tr1l.so.1.82.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
