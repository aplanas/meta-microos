SUMMARY = "Octave interface for openEMS"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method. \
 \
This package provides Octave interface for openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "octave-openEMS-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "ad5d0e738e0f24ee35f5d05c5e132d786a33b8ba9d2a96ee5e1a687222b67dedf8cdcbe570385682eb40429efe3a6b1003d5b12b8e16d1fc15711d5a18274b81"

RPROVIDES:${PN} += "octave-openEMS \
octave-openEMS(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
AppCSXCAD \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libhdf5.so.200()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-CSXCAD \
octave-cli \
openEMS"

inherit rpm
