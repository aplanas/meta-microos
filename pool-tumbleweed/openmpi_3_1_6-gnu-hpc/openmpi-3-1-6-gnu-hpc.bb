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

RPM_NAME = "openmpi_3_1_6-gnu-hpc-3.1.6-7.2.aarch64.rpm"
RPM_HASH = "41a7768cd2e1d4cd4e58fdfaf3803620c75c7cd09f339e730074202371fe7a823a46416381658064c74ef745d613e71a96e2ac3c3fdde2af3676d700b70ee1a7"

RPROVIDES:${PN} += "mpi \
openmpi_3_1_6-gnu-hpc \
openmpi_3_1_6-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libopenmpi_3_1_6-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
