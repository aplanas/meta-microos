SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 2.1.6"
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

PV = "2.1.6"

RPM_NAME = "libopenmpi_2_1_6-gnu-hpc-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "185d7c6d5dd55c84612e695d39fed2935f95cbbc344e4ae91555bb5a6eaf9c70df4e7750823a74598bb0d766a4a83a6fdaf3226f1f0f3f840e72082776b9a087"

RPROVIDES:${PN} += "libopenmpi-2-1-6-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libucp.so.0 \
lua-lmod \
openmpi-2-1-6-gnu-hpc"

inherit rpm
