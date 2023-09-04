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

RPM_NAME = "libopenmpi_1_10_7-gnu-hpc-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "9f5fba760f835f9ee761c0c5324e353c2c96d0f251cc447d13b051197ff1c64c4e6773e261315860cefb714b524e98f5cf665f94279928074024093e15503cd4"

RPROVIDES:${PN} += "libopenmpi-1-10-7-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
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
