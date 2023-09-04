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

RPM_NAME = "openmpi5-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "ec1e8260b18fac9bf0ea83936398088273e8147361df573c5bf6cb0960c33f3447d86dbf2fb0f99a49ccfb2089ee82b1b942002e615bb44771934ffb08eefc81"

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
