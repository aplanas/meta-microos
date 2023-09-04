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

RPM_NAME = "openmpi_4_1_5-gnu-hpc-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "23e2cc92fcb33b686e1042e07caa43c8c34a86351595694b0135c02b2d14c1f0fa14bd6f53476bd6cab0dbd0c347423a42ec871c4db03c1d283562923221225a"

RPROVIDES:${PN} += "mpi \
openmpi-4-1-5-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libopenmpi-4-1-5-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
