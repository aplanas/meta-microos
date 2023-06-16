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

RPM_NAME = "mpich-ofi_4_0_2-gnu-hpc-4.0.2-3.3.aarch64.rpm"
RPM_HASH = "09e5d4ecf8aea75807749efdb0f481a450b4210bcadfa8ef5d9b6d97c599ff00586ff79699387e35bfdffe9b1d051f30276dcc0a8b3905f6779c3868ccbc88c2"

RPROVIDES:${PN} += "mpi \
mpich-ofi-4-0-2-gnu-hpc"

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
