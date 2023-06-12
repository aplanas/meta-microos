SUMMARY = "Boost.MPI runtime library"
DESCRIPTION = "This package contains the Boost.MPI runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_mpi1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "b636cb4eb4e45001f8bd4f29f0da9b1dd14c028d20f63bb2cda1abf1a84e0f3dd748d2a6d45960c6f3d4eb022e4e969e90e1717148bb8dcf839beaff1383dadd"

RPROVIDES:${PN} += "libboost_mpi.so.1.82.0()(64bit) \
libboost_mpi1_82_0 \
libboost_mpi1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
