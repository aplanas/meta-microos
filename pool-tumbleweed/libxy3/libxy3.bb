SUMMARY = "Library for reading x-y data from several file formats"
DESCRIPTION = "C++ library for reading files that contain x-y data from powder diffraction, \
spectroscopy or other experimental methods. The supported formats include: \
VAMAS, pdCIF, Bruker UXD and RAW, Philips UDF and RD, Rigaku DAT, \
Sietronics CPI, DBWS/DMPLOT, Koalariet XDD and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libxy3-1.6-1.15.aarch64.rpm"
RPM_HASH = "7d7c9758b8e0e88f6efd3dd42531371f354c2887b7ea7589e5fd9974dc5cf41157de189f7912783ca3feade3e1d99c403ebfbb1b8a2b847109573efacb27be10"

RPROVIDES:${PN} += "libxy.so.3()(64bit) \
libxy3 \
libxy3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
