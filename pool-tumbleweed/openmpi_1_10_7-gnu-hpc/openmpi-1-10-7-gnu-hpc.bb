SUMMARY = "A powerful implementation of MPI"
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

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "e1c3d409e5995dbab390d7b1a7a08836d5f585e245352dff99dd326664045c0ce2e9ff4cdb9f5e6e9f39a3ff8a1ce70def12f3ffbd2d91796616554c1a0cceaf"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi-1-10-7-gnu-hpc \
lua-lmod \
openmpi-runtime-config"

inherit rpm
