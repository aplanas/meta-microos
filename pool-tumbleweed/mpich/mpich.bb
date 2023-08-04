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

RPM_NAME = "mpich-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "1193fe3b11f308d45d036b3757a7f5d2db4e3f65c8ca2825b10b7493714172a318c86108b473a7989ce69db7e59d662f10d0728ca3639295ee99fc17b8c52db3"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mpi \
mpich"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
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
