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

PV = "4.1.2"

RPM_NAME = "mpich-ofi_4_1_2-gnu-hpc-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "bf1797bf64e9ca287d6e555518c2e32114e5b1d3b1ec0b63effa4328f9fa2d2da2e975a8d5491d1dfc5610378a8cd59aa454587b63edaa5f6dc6aa82865a0357"

RPROVIDES:${PN} += "mpi \
mpich-ofi-4-1-2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
lua-lmod"

inherit rpm
