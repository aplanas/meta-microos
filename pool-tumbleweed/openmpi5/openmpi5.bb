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

RPM_NAME = "openmpi5-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "02c3cb9bceffbb3ab1bf3ed7fa4c3bf67c05c288b0e6bd335301677fe96b9bd111e53b0be4f0d7e8cf5ddbe252db9e55bd33d70fba9ff324b103d6d517278705"

RPROVIDES:${PN} += "mpi \
openmpi5 \
openmpi5(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libhwloc.so.15()(64bit) \
libmpi.so.80()(64bit) \
libopen-pal.so.80()(64bit) \
liboshmem.so.80()(64bit) \
libprrte.so.2()(64bit) \
mpi-selector \
openmpi-runtime-config \
openmpi5-libs \
openssh"

inherit rpm
