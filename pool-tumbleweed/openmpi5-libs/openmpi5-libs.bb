SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 5.0.0"
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
This package provides the Open MPI/OpenSHMEM version 5 \
shared libraries."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-libs-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "a6dc84740a28a9373adfea7d96f85746840e3c8c66b0a47d4673eb8257ecb536f8b3f860072673e03b0e3cad759490d78697ea57f24d47b2df388827defc168d"

RPROVIDES:${PN} += "libmpi.so.80()(64bit) \
libmpi_mpifh.so.80()(64bit) \
libmpi_usempi_ignore_tkr.so.80()(64bit) \
libmpi_usempif08.so.80()(64bit) \
libompi_dbg_msgq.so()(64bit) \
libopen-pal.so.80()(64bit) \
liboshmem.so.80()(64bit) \
libprrte.so.2()(64bit) \
openmpi5-libs \
openmpi5-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent_core-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit) \
libfabric.so.1()(64bit) \
libhwloc.so.15()(64bit) \
libm.so.6()(64bit) \
libucm.so.0()(64bit) \
libucp.so.0()(64bit) \
libucs.so.0()(64bit) \
libuct.so.0()(64bit) \
libz.so.1()(64bit) \
openmpi5"

inherit rpm
