SUMMARY = "SDK for openMPI  version 3.1.6"
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

PV = "3.1.6"

RPM_NAME = "openmpi3-devel-3.1.6-7.4.aarch64.rpm"
RPM_HASH = "4d55603885808a5b899cc3865966e5d63a5d0f79d097f9bf1d14d5da3e0e8ac620647efb18e254a1d7caef1b3c7013e826ad53de98719d65aef14f558c24c960"

RPROVIDES:${PN} += "openmpi3-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libmpi.so.40 \
libopen-pal.so.40 \
libstdc++-devel \
openmpi3"

inherit rpm
