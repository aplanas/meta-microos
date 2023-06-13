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

RPM_NAME = "openmpi_5_0_0-gnu-hpc-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "16628a1ebaa8b6c39bb954ebfae3aad34d43733b8edb02c66147e2f5fd1572d4235a56a77995dc7753725c954bd91ac31d46909d6744786ffb05fa8258e0e83d"

RPROVIDES:${PN} += "mpi \
openmpi_5_0_0-gnu-hpc \
openmpi_5_0_0-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libhwloc.so.15()(64bit) \
libopenmpi_5_0_0-gnu-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
