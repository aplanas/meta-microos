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

RPM_NAME = "mpich-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "f29611aba68a67a69c19ae5645f7bfb298436d0b2897ccbe6ffa93f1a1b772890f63ec31cc3054457cb06f3c43fdb2857422f023f0c6ab3239d0ff2e81038693"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mpi \
mpich"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
mpi-selector"

inherit rpm
