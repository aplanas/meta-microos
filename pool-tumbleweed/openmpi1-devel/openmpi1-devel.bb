SUMMARY = "SDK for openMPI  version 1.10.7"
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

RPM_NAME = "openmpi1-devel-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "33157b01e2d6e1336fffdbe04a6ab308f35462bbd468aa74dea406e81f0ba26a3125fb0e874f2775783a575a7b0ec3e29ccad18e18db89138597b5af5bca5a2c"

RPROVIDES:${PN} += "openmpi1-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libibumad-devel \
libibverbs-devel \
libm.so.6 \
libmpi.so.12 \
libopen-pal.so.13 \
libopen-trace-format.so.1 \
libotfaux.so.0 \
libstdc++-devel \
libstdc++.so.6 \
libz.so.1 \
openmpi1"

inherit rpm
