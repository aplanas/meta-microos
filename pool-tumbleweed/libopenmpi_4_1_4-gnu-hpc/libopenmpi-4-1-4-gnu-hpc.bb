SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 4.1.4"
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
This package provides the Open MPI/OpenSHMEM version 4 \
shared libraries."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "libopenmpi_4_1_4-gnu-hpc-4.1.4-2.2.aarch64.rpm"
RPM_HASH = "4263de5e87e7d12440a014e39e2681637aa74e157fafe3e7be84b201214bf59deb294acd6649cb7671ad4bd5f125e8d72447f02f3ac186b2244015f2423dd174"

RPROVIDES:${PN} += "libopenmpi-4-1-4-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libfabric.so.1 \
libhwloc.so.15 \
libibverbs.so.1 \
libm.so.6 \
libpmix.so.2 \
librdmacm.so.1 \
libucp.so.0 \
libucs.so.0 \
libz.so.1 \
lua-lmod \
openmpi-4-1-4-gnu-hpc"

inherit rpm
