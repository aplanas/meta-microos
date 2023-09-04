SUMMARY = "SDK for openMPI  version 2.1.6"
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

RPM_NAME = "openmpi2-devel-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "4c484affa07f77082033aa022f3c93d360cce9b909e0f483e2454b36d310547c8395bc6525a581abacf3e400682ce461abece369367d4460d3f0f7d81e265e7f"

RPROVIDES:${PN} += "openmpi2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libopen-pal.so.20 \
libstdc++-devel \
openmpi2"

inherit rpm
