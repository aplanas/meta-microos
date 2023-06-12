SUMMARY = "SDK for openMPI  version 2.1.6"
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

PV = "2.1.6"

RPM_NAME = "openmpi2-devel-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "d097cb47f7c3f5499c6ffa7a7decb7cd38c09e0b06d6b85bf59cf165f10cf080a9698827b98f1bcd9fa16981f317ea283c5bd659df1cf60ec23cc092cc2f1754"

RPROVIDES:${PN} += "openmpi2-devel \
openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libibumad-devel \
libibverbs-devel \
libopen-pal.so.20()(64bit) \
libstdc++-devel \
openmpi2"

inherit rpm
