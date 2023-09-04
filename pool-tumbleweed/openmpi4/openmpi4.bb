SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
DESCRIPTION = " \
 \
 \
 \
OpenMPI is an implementation of the Message Passing Interface, a \
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
This package provides general tools (mpirun, mpiexec, etc.) and the \
Module Component Architecture (MCA) base and plugins necessary for \
running Open MPI/OpenSHMEM version 4 jobs."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "d21f8e0127f7efc87af3eabf8f6477d87e394830e7d1225d8c2aa097b6f3088d3e64515144440757ee5ab41fe3f8a63d798bc551558a16ba2077fa55512e7511"

RPROVIDES:${PN} += "mpi \
openmpi \
openmpi4"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libmpi.so.40 \
libopen-pal.so.40 \
libopen-rte.so.40 \
liboshmem.so.40 \
mpi-selector \
openmpi-runtime-config \
openmpi4-libs \
openssh"

inherit rpm
