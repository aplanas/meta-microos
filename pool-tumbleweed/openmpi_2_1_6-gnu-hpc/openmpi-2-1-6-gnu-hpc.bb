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

RPM_NAME = "openmpi_2_1_6-gnu-hpc-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "be5697c2e5590462bb9253c690f6f2f479486f82a6cba57cb44891cfb6be5c236bb594eed2a5cb42829371e16295c73d31274a1bce49a92566e46faa34172bc8"

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
