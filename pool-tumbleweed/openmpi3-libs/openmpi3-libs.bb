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

RPROVIDES:${PN} += "libmca_common_dstore.so.1()(64bit) \
libmca_common_monitoring.so.50()(64bit) \
libmca_common_ompio.so.41()(64bit) \
libmca_common_sm.so.40()(64bit) \
libmca_common_verbs.so.40()(64bit) \
libmpi.so.40()(64bit) \
libmpi_mpifh.so.40()(64bit) \
libmpi_usempi_ignore_tkr.so.40()(64bit) \
libmpi_usempif08.so.40()(64bit) \
libompi_dbg_msgq.so()(64bit) \
libompitrace.so.40()(64bit) \
libopen-pal.so.40()(64bit) \
libopen-rte.so.40()(64bit) \
liboshmem.so.40()(64bit) \
openmpi3-libs \
openmpi3-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit) \
libfabric.so.1()(64bit) \
libibverbs.so.1()(64bit) \
libm.so.6()(64bit) \
librdmacm.so.1()(64bit) \
libucm.so.0()(64bit) \
libucp.so.0()(64bit) \
libucs.so.0()(64bit) \
openmpi3"

inherit rpm
