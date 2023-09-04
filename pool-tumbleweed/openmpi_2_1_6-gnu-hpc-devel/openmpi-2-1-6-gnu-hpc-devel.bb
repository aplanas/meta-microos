SUMMARY = "SDK for openMPI HPC version 2.1.6"
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

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-devel-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "65ba369090179d177ea211626d4ec66a61c1949e870d7e001c999c136e9ceabf690dcd8e5ced656efc55dc9d5684eccb3d2b0828c6054ed38e1d888a79b70909"

RPROVIDES:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfabric.so.1 \
libibumad-devel \
libibverbs-devel \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libucp.so.0 \
openmpi-2-1-6-gnu-hpc"

inherit rpm
