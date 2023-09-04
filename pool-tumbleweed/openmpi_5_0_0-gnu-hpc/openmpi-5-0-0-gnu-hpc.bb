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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "41371c6e656993726dca720f86a4bf40c6ffb66ab2d74ce48b96ec837f0a4988b03f29e0b56c41a43acdb8a2bdb1543cc8f46c9a50450f6ca20cf56d71911614"

RPROVIDES:${PN} += "mpi \
openmpi-5-0-0-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libhwloc.so.15 \
libopenmpi-5-0-0-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
