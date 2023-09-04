SUMMARY = "An implementation of MPI/SHMEM"
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
running Open MPI/OpenSHMEM jobs."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "8b9d4b682bee3a8defbf73f0b2494210eeafe7b479cb883ffce9fe5ac5f19cdb40701644596ec492529c4d4ebe2034cfd0a856ab4d859456ba50d0ea34914035"

RPROVIDES:${PN} += "mpi \
openmpi2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.20 \
libopen-pal.so.20 \
libopen-rte.so.20 \
liboshmem.so.20 \
mpi-selector \
openmpi-runtime-config \
openmpi2-libs \
openssh"

inherit rpm
