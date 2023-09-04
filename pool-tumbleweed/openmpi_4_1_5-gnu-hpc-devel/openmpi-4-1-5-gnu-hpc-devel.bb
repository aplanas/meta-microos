SUMMARY = "SDK for openMPI HPC version 4.1.5"
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
This package provides the development files for Open MPI/OpenSHMEM \
version 4, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi_4_1_5-gnu-hpc-devel-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "de8b4a322a6e8ae787737506e29ab48fbaaa3091c4ebd8a27da3ab9e9648894bd6f6bdf0676cb82736673ca409f74d2d32de41a0cacaaf0d84f7258561184110"

RPROVIDES:${PN} += "openmpi-4-1-5-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libfabric.so.1 \
libhwloc.so.15 \
libibumad-devel \
libibverbs-devel \
libibverbs.so.1 \
libm.so.6 \
libpmix.so.2 \
librdmacm.so.1 \
libucp.so.0 \
libucs.so.0 \
libz.so.1 \
openmpi-4-1-5-gnu-hpc"

inherit rpm
