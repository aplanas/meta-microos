SUMMARY = "OpenMPI runtime libraries for OpenMPI HPC version 1.10.7"
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

PV = "1.10.7"

RPM_NAME = "libopenmpi_1_10_7-gnu-hpc-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "d81161eb4c4a14f82d9443dd4c81932f5b7c72e20f199cfa7d8954e35cc14cedd2607736e4879a0028fadcfc2d345b2d035b34176ac037927cb9db21751fc487"

RPROVIDES:${PN} += "libopenmpi-1-10-7-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libstdc++.so.6 \
libucp.so.0 \
libz.so.1 \
lua-lmod \
openmpi-1-10-7-gnu-hpc"

inherit rpm
