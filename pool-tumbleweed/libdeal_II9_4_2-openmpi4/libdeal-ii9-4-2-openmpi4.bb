SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-openmpi4-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "333243cc7373bdd1d8f7296abf1a2618e266047737885df159c1dc014ec7f4470c6abf5b1450bc01e4c6db8de26d4d33f328c65f5849178bf46a9eb00c043cfd"

RPROVIDES:${PN} += "libdeal_II.so.9.4.2()(64bit) \
libdeal_II9_4_2-openmpi4 \
libdeal_II9_4_2-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgmsh.so.4.11()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmetis.so.5()(64bit) \
libmpi.so.40()(64bit) \
libmuparser.so.2.3.4()(64bit) \
libopenblas.so.0()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtbb.so.12()(64bit) \
libumfpack.so.5()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
