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

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "a575d2d695f6fcca9b5fc1f6f590f3eb31f87b1cd083a3ae2cb4ef529991e92f7035abaa9b6d9cece299d2d9cdfb0a09c24f0d16db7eaa9c5a25d42e09152acd"

RPROVIDES:${PN} += "mpi \
openmpi-3-1-6-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libopenmpi-3-1-6-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
