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

RPM_NAME = "openmpi5-libs-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "bab43ef40dff290bf1d0a0ba6cd70a30e1551fb79b80b6edf249bbbd3a06d2196b71962008fee2f90dd528867d930c4e63ad85121961b5c5d0e3581120256bd6"

RPROVIDES:${PN} += "libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libompi-dbg-msgq.so \
libopen-pal.so.80 \
liboshmem.so.40 \
libprrte.so.3 \
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
