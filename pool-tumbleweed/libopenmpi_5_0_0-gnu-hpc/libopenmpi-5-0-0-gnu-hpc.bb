SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 5.0.0"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
OpenMPI also includes an implementation of the OpenSHMEM parallel \
programming API, which is a Partitioned Global Address Space (PGAS) \
abstraction layer providing inter-process communication using \
one-sided communication techniques. \
 \
This package provides the Open MPI/OpenSHMEM version 5 \
shared libraries."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "libopenmpi_5_0_0-gnu-hpc-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "eab46ba592226260bdf950ee03cfc1b8ddd36b647c73421c4cedf0b72f256a61788bdfb64cb4c0292aa72721c6bff1d4068d9383282cd8dccdd77c6b5c4c2a6d"

RPROVIDES:${PN} += "libopenmpi-5-0-0-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libfabric.so.1 \
libhwloc.so.15 \
libm.so.6 \
libucp.so.0 \
libucs.so.0 \
libuct.so.0 \
libz.so.1 \
lua-lmod \
openmpi-5-0-0-gnu-hpc"

inherit rpm
