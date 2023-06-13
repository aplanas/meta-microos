SUMMARY = "SDK for openMPI  version 1.10.7"
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

PV = "1.10.7"

RPM_NAME = "openmpi1-devel-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "cdf3fc3b3198cc9d49ae0e8084328d36b3a9f6e89df71cbf4d6e5b8c445ffa474becb0d74f727799213db9777603300ddf4bb1d091118f348bceb1bf8c6efa33"

RPROVIDES:${PN} += "openmpi1-devel \
openmpi1-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libibumad-devel \
libibverbs-devel \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libopen-pal.so.13()(64bit) \
libopen-trace-format.so.1()(64bit) \
libotfaux.so.0()(64bit) \
libstdc++-devel \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
openmpi1"

inherit rpm
