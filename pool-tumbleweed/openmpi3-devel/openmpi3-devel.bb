SUMMARY = "SDK for openMPI  version 3.1.6"
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
This subpackage provides the development files for Open MPI/OpenSHMEM, \
such as wrapper compilers and header files for MPI/OpenSHMEM \
development."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-devel-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "b069bb900cb61e649adeadd34de4f93a03e64363ecc4dc21c6ef06e4862ed82010d994bb71942c3cbd9df1bd83537af4fdc7fabddbe79369a75f7f3021c5515a"

RPROVIDES:${PN} += "openmpi3-devel \
openmpi3-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libibumad-devel \
libibverbs-devel \
libmpi.so.40()(64bit) \
libopen-pal.so.40()(64bit) \
libstdc++-devel \
openmpi3"

inherit rpm
