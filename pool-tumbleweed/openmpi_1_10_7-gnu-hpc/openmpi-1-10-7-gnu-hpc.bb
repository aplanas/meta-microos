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

RPM_NAME = "openmpi_1_10_7-gnu-hpc-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "a8d0cabbc74892d73bfb1a89f5769f50c0a503fdd0e2878b1c72856da8a21345367da54a9257be1c5524a856b46d5acc4973afd715043a7fae7af54a1184f320"

RPROVIDES:${PN} += "openmpi_1_10_7-gnu-hpc \
openmpi_1_10_7-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libopenmpi_1_10_7-gnu-hpc \
lua-lmod \
openmpi-runtime-config"

inherit rpm
