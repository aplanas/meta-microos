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

RPM_NAME = "libopenmpi_1_10_7-gnu-hpc-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "42600fe25c22ac037a85932d44dcf696bfca6e2ad73766e29ac3fef96ca3e6e9d3035b36a85360e362abb8afed888096863456c9cabae1f228f31ca12d42fa9c"

RPROVIDES:${PN} += "libopenmpi_1_10_7-gnu-hpc \
libopenmpi_1_10_7-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
librdmacm.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libucp.so.0()(64bit) \
libz.so.1()(64bit) \
lua-lmod \
openmpi_1_10_7-gnu-hpc"

inherit rpm
