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

RPM_NAME = "mpich_4_1_2-gnu-hpc-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "0d4030cd04a94d9e4c65f0ef04a48b89b534c012ff48b70dd1ab78a7e7f18fe7e11ddf17239eb072c4c73fa9ce70038cc9cc4817c24ecac240829be13dad7413"

RPROVIDES:${PN} += "mpi \
mpich-4-1-2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
lua-lmod"

inherit rpm
