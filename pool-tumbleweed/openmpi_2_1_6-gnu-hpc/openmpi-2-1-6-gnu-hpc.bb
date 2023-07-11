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

RPM_NAME = "openmpi_2_1_6-gnu-hpc-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "8b1e69841199c418256057d41c0e98d065f48d9d65c1a96bf906015e2a2d2470d7157ad9d123d6ffbe18da59bf9c5255fb01125f228e27d3a2b3d2824af4bf11"

RPROVIDES:${PN} += "mpi \
openmpi-2-1-6-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi-2-1-6-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
