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

RPM_NAME = "mpich_4_0_2-gnu-hpc-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "7031da7eedc9c0b80eb182446aff7cb190d0a6646a329b045b5d8ab92110eec4b677d9cb4dd8d51ddc83c8ebbd0a1d5f1d266c2256355a619f33a73d14518bc3"

RPROVIDES:${PN} += "mpi \
mpich_4_0_2-gnu-hpc \
mpich_4_0_2-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgfortran.so.5(GFORTRAN_9)(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libucp.so.0()(64bit) \
libucs.so.0()(64bit) \
lua-lmod"

inherit rpm
