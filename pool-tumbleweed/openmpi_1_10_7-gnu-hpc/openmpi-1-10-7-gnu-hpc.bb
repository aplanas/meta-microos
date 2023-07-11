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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "ad3efd5866d94da08300f7a81cc224f8d2ba7b0f755834e8883a01c7129429a806dc9633638503543890667d88ffb9ad350a3d62e2dfce61ca4cd58cc0b4c1da"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi-1-10-7-gnu-hpc \
lua-lmod \
openmpi-runtime-config"

inherit rpm
