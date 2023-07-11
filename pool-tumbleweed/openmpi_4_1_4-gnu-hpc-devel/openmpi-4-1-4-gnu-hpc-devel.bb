SUMMARY = "SDK for openMPI HPC version 4.1.4"
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

PV = "4.1.4"

RPM_NAME = "openmpi_4_1_4-gnu-hpc-devel-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "c461c1ebe85192b9fee27d526a42261ff6550496db04b79fde25a706794034f061524efcf2fe272238c441802da46c87f5ac001f7326fa84d4c117f44244aba0"

RPROVIDES:${PN} += "openmpi-4-1-4-gnu-hpc-devel"

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
openmpi-4-1-4-gnu-hpc"

inherit rpm
