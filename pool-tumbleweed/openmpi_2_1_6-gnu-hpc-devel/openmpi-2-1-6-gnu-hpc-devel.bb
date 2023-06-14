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

RPM_NAME = "openmpi_2_1_6-gnu-hpc-devel-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "fc27cd09722bdfb565b410abe474f5b95555ffbf12ccdd73a86879f46a25bda8cb71d77f056bb845c5adb8909b945d878705b02af8ceefcdb1118060c617746f"

RPROVIDES:${PN} += "openmpi-2-1-6-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libucp.so.0 \
openmpi-2-1-6-gnu-hpc"

inherit rpm
