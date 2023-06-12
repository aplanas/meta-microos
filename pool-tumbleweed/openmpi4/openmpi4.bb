SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
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
running Open MPI/OpenSHMEM version 4 jobs."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "08302c6e5ec2a546f67d83ad206ed072a498d917ca86bff7c582d8cdee9e0fec90515aaa16a0892c5b3cbe806ba22dfed31b73932904a760124733101aebdc3d"

RPROVIDES:${PN} += "mpi \
openmpi \
openmpi4 \
openmpi4(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libmpi.so.40()(64bit) \
libopen-pal.so.40()(64bit) \
libopen-rte.so.40()(64bit) \
liboshmem.so.40()(64bit) \
mpi-selector \
openmpi-runtime-config \
openmpi4-libs \
openssh"

inherit rpm
