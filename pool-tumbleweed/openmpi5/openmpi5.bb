SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
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
running Open MPI/OpenSHMEM version 5 jobs."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "57e82e4793fd30177cb889a0376c5f5f2b19522aae08d6530c2a158ea2d51388f942a3faa143120492099d3cb197a1046daa8ac74d2d4eafbd8ced6643e1d6e2"

RPROVIDES:${PN} += "mpi \
openmpi5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libhwloc.so.15 \
libmpi.so.40 \
libopen-pal.so.80 \
liboshmem.so.40 \
libprrte.so.3 \
mpi-selector \
openmpi-runtime-config \
openmpi5-libs \
openssh"

inherit rpm
