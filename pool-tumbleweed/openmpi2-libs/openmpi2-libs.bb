SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 2.1.6"
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

PV = "2.1.6"

RPM_NAME = "openmpi2-libs-2.1.6-14.3.aarch64.rpm"
RPM_HASH = "8c5081fdcaa675ee1f7583c3a118058438bf118aa0aa09de47b645f4f88e909d0c53660e229bfa8a359acb5a6271891a50e87e34c008e8731102bcf472535a6a"

RPROVIDES:${PN} += "libmca-common-sm.so.20 \
libmca-common-verbs.so.20 \
libmpi-mpifh.so.20 \
libmpi-usempi-ignore-tkr.so.20 \
libmpi-usempif08.so.20 \
libmpi.so.20 \
libompi-dbg-msgq.so \
libompitrace.so.20 \
libopen-pal.so.20 \
libopen-rte.so.20 \
liboshmem.so.20 \
openmpi2-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libucp.so.0 \
openmpi2"

inherit rpm
