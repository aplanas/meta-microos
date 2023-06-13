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

RPM_NAME = "openmpi1-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "04508c56b99b2f891c10750a301692b024c4d4ffedf4110ca57d45ee1a00d24cb736bf91c5e3fa07a40581f26d382d5ba67e9deb665cf26d39f0c421514062fa"

RPROVIDES:${PN} += "openmpi1 \
openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmpi.so.12()(64bit) \
libopen-pal.so.13()(64bit) \
libopen-rte.so.12()(64bit) \
liboshmem.so.8()(64bit) \
mpi-selector \
openmpi-runtime-config \
openmpi1-libs"

inherit rpm
