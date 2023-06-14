SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 3.1.6"
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
This subpackage provides the OpenMPI shared libraries."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-libs-3.1.6-7.3.aarch64.rpm"
RPM_HASH = "7e3a17d8e8a0e804af50af27506f621f9c80585dc1303b171291dd9f9523eb51092db268492c2c320ff3bfab3d459295b058d9cf01a06b59c938b63a8c50be9d"

RPROVIDES:${PN} += "libmca-common-dstore.so.1 \
libmca-common-monitoring.so.50 \
libmca-common-ompio.so.41 \
libmca-common-sm.so.40 \
libmca-common-verbs.so.40 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libompi-dbg-msgq.so \
libompitrace.so.40 \
libopen-pal.so.40 \
libopen-rte.so.40 \
liboshmem.so.40 \
openmpi3-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libfabric.so.1 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libucm.so.0 \
libucp.so.0 \
libucs.so.0 \
openmpi3"

inherit rpm
