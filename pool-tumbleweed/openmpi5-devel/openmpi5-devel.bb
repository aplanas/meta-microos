SUMMARY = "SDK for openMPI  version 5.0.0"
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
version 5, such as wrapper compilers and header files for \
MPI/OpenSHMEM development."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-devel-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "e9a60cdf7a5a02111965c5fd4b280adbe63f737286fa22746d48481e4413ff0ccd72e1ff699afe0c409d8937659530d3f2d0bb3df0477640063849bd635dffee"

RPROVIDES:${PN} += "openmpi5-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad-devel \
libibverbs-devel \
libopen-pal.so.80 \
libstdc++-devel \
openmpi5"

inherit rpm
