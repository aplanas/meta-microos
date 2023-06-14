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

RPROVIDES:${PN} += "libmpi-mpifh.so.80 \
libmpi-usempi-ignore-tkr.so.80 \
libmpi-usempif08.so.80 \
libmpi.so.80 \
libompi-dbg-msgq.so \
libopen-pal.so.80 \
liboshmem.so.80 \
libprrte.so.2 \
openmpi5-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libfabric.so.1 \
libhwloc.so.15 \
libm.so.6 \
libucm.so.0 \
libucp.so.0 \
libucs.so.0 \
libuct.so.0 \
libz.so.1 \
openmpi5"

inherit rpm
