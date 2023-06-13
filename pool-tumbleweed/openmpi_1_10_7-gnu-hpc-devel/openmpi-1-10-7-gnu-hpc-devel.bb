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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-devel-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "d6f2946089961cd18a63081d7272086977a4f75d7b27dbae7cf8badd6e45b9eac4a18773e430e99c72a16fbb3062480ebe3d7b98eaaee0cda04a47a113baaf6c"

RPROVIDES:${PN} += "openmpi_1_10_7-gnu-hpc-devel \
openmpi_1_10_7-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libibumad-devel \
libibverbs-devel \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
librdmacm.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libucp.so.0()(64bit) \
libz.so.1()(64bit) \
openmpi_1_10_7-gnu-hpc"

inherit rpm
