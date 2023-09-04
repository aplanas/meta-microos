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

RPM_NAME = "openmpi3-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "c79d597f56d2d07d753ff6c780fd237ad85be205b8d12916137523b86c0c3c86a28fbb531caf736c736ca63c2dca9840c19c692e54ef26fef5265b8109d25353"

RPROVIDES:${PN} += "mpi \
openmpi3"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libmpi.so.40 \
libopen-pal.so.40 \
libopen-rte.so.40 \
liboshmem.so.40 \
mpi-selector \
openmpi-runtime-config \
openmpi3-libs \
openssh"

inherit rpm
