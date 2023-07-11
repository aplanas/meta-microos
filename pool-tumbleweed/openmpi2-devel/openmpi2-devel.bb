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

RPM_NAME = "openmpi2-devel-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "759113dd16399f41c3c8a7a0c09c874042ab612fd85cef09b93f0464a8b79ed3630507d6a7ac979cfcccacfb5f8cc14b1cd7264c0240a80421daf3798182d3af"

RPROVIDES:${PN} += "openmpi2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libopen-pal.so.20 \
libstdc++-devel \
openmpi2"

inherit rpm
