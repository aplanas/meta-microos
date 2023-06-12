SUMMARY = "Astrometric Solver runtime library"
DESCRIPTION = "An Astrometric Plate Solver for Mac, Linux, and Windows, \
built on Astrometry.net and SEP (sextractor), runtime library."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "libstellarsolver2-2.4-2.3.aarch64.rpm"
RPM_HASH = "1cc1999a841a1c26c8551b2ebaa3f92174d9053f9d8c2ad53142d88992163e171ddd33e7637f35237389d074cf0dba7af4e57cf216f95e63058d1e01dc980fc0"

RPROVIDES:${PN} += "libstellarsolver.so.2()(64bit) \
libstellarsolver2 \
libstellarsolver2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcfitsio.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwcs.so.7()(64bit)"

inherit rpm
