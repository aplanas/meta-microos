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

RPM_NAME = "openmpi5-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "016d4c693dd024ab87bbcd344387c6f8abe7d631434d50f4f319c9ca2aa06ded84a3bcb01e4934c5aa936ff4df95846d9542d9c881a05fa95152cc828436c38e"

RPROVIDES:${PN} += "mpi \
openmpi5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libhwloc.so.15 \
libmpi.so.80 \
libopen-pal.so.80 \
liboshmem.so.80 \
libprrte.so.2 \
mpi-selector \
openmpi-runtime-config \
openmpi5-libs \
openssh"

inherit rpm
