SUMMARY = "SDK for openMPI HPC version 5.0.0"
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
version 5, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-devel-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "44ab42c687e2b92e934206cd8a537b10cb9f1299f98ed1db1deda7c396201bf3c60342b0f9229c8e617ce24bb6d8841038e896e0af62523dcdafc55ff295122a"

RPROVIDES:${PN} += "openmpi-5-0-0-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libfabric.so.1 \
libhwloc.so.15 \
libibumad-devel \
libibverbs-devel \
libm.so.6 \
libucp.so.0 \
libucs.so.0 \
libuct.so.0 \
libz.so.1 \
openmpi-5-0-0-gnu-hpc"

inherit rpm
