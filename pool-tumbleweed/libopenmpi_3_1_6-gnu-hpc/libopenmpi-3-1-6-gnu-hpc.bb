SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 3.1.6"
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
This subpackage provides the OpenMPI shared libraries."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "libopenmpi_3_1_6-gnu-hpc-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "ab81f6b4d0791ae3e54e78146464825e352281a743a52016581485b70928bda21829d8182379f06bbf742481e8b611e8ae0070b89ed774ef34e5a6ea0ea637a0"

RPROVIDES:${PN} += "libopenmpi-3-1-6-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
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
openmpi-3-1-6-gnu-hpc"

inherit rpm
