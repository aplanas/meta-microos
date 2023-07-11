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

RPM_NAME = "openmpi1-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "8fae9409ac7a6890b0e37f01fb7a8c65add2f4576f40ee1291011d4564f93601fae28cb7eb120f06f0f1546605f111a505f577a757fd013b34473bac59304429"

RPROVIDES:${PN} += "openmpi1"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12 \
libopen-pal.so.13 \
libopen-rte.so.12 \
liboshmem.so.8 \
mpi-selector \
openmpi-runtime-config \
openmpi1-libs"

inherit rpm
