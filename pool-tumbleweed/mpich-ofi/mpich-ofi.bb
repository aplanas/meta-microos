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

RPM_NAME = "mpich-ofi-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "121975162d7722169c6bea02cd4b58a77007fa7c37d4576e2c45bd5afabd0a349a010beb27fadcff3f2dee9f466cbd4161161ed92ddb623b535de73950ec773c"

RPROVIDES:${PN} += "libmpi.so.12 \
libmpicxx.so.12 \
libmpifort.so.12 \
mpi \
mpich-ofi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgfortran.so.5 \
libjson-c.so.5 \
libm.so.6 \
libstdc++.so.6 \
mpi-selector"

inherit rpm
