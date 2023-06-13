SUMMARY = "High-performance and widely portable implementation of MPI"
DESCRIPTION = "MPICH is a high performance and widely portable implementation of the Message \
Passing Interface (MPI) standard. \
 \
The goals of MPICH are: \
 \
 * to provide an MPI implementation that efficiently supports different \
   computation and communication platforms including commodity clusters \
   (desktop systems, shared-memory systems, multicore architectures), \
   high-speed networks and proprietary high-end computing systems \
   (Blue Gene, Cray) \
 * to enable cutting-edge research in MPI through an easy-to-extend modular \
   framework for other derived implementations"
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "9f0c96fa2878c7d12ef9616bb7c28e4987a9ddecb0a6ad529847995e190272b9eb2ee383fd71e44a9099dd1ac81a8ee0eaea4d1dfa941e7f98a4876b85c77dff"

RPROVIDES:${PN} += "libmpi.so.12()(64bit) \
libmpicxx.so.12()(64bit) \
libmpifort.so.12()(64bit) \
mpi \
mpich-ofi \
mpich-ofi(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfabric.so.1()(64bit) \
libfabric.so.1(FABRIC_1.0)(64bit) \
libfabric.so.1(FABRIC_1.1)(64bit) \
libfabric.so.1(FABRIC_1.3)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
mpi-selector"

inherit rpm
