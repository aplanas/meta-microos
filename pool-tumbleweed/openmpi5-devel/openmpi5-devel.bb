SUMMARY = "SDK for openMPI  version 5.0.0"
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

RPM_NAME = "openmpi5-devel-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "58a0e29e116382f724fac2f61da992ebc69fa96037510e934d30d5ba38f9412e352baee1346adc9aa3a76ce695a221b055a9bc2d2d3cf6a84dc931ff2cd764eb"

RPROVIDES:${PN} += "openmpi5-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libstdc++-devel \
openmpi5"

inherit rpm
