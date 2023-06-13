SUMMARY = "SDK for openMPI  version 4.1.4"
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

PV = "4.1.4"

RPM_NAME = "openmpi4-devel-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "77d2169fb9e0883f7dff872cb68e43059998e537087fee3645944cc0008cd0282ee3f96b774e5b82f177397d7e57fcf6f36d18420af92da1a30d845b607077ba"

RPROVIDES:${PN} += "openmpi-devel \
openmpi4-devel \
openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libibumad-devel \
libibverbs-devel \
libm.so.6()(64bit) \
libmpi.so.40()(64bit) \
libopen-pal.so.40()(64bit) \
libstdc++-devel \
openmpi4"

inherit rpm
