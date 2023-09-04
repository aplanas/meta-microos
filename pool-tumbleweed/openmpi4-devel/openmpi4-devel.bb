SUMMARY = "SDK for openMPI  version 4.1.5"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
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
This package provides the development files for Open MPI/OpenSHMEM \
version 4, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-devel-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "54cd500ca4749ad10cb8b5a88637fbebfeab7d8ca3768bddb3ae20ca923dba5ebc8358b5734ee21661332bc72273373595baa934f6b6c33deba9f3fcc54a4679"

RPROVIDES:${PN} += "openmpi-devel \
openmpi4-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libm.so.6 \
libmpi.so.40 \
libopen-pal.so.40 \
libstdc++-devel \
openmpi4"

inherit rpm
