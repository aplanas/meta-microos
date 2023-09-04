SUMMARY = "SDK for openMPI HPC version 1.10.7"
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
This subpackage provides the development files for Open MPI/OpenSHMEM, \
such as wrapper compilers and header files for MPI/OpenSHMEM \
development."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-devel-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "ac4a366dc7485152d0d511791968f25953aac3d4ccd1a4f4693b4d7fe59832293328b5fb2deae903f749422d9b02a0ed15d4529837285ce42f3d32f524ff14a8"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libgcc-s.so.1 \
libgomp.so.1 \
libibumad-devel \
libibverbs-devel \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libstdc++.so.6 \
libucp.so.0 \
libz.so.1 \
openmpi-1-10-7-gnu-hpc"

inherit rpm
