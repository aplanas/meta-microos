SUMMARY = "OpenMPI runtime libraries for OpenMPI  version 1.10.7"
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

PV = "1.10.7"

RPM_NAME = "openmpi1-libs-1.10.7-7.5.aarch64.rpm"
RPM_HASH = "e9edc64d3bd274206887e220fd0c99c50a6a0484ecd3e70b5f1f1469f9647da41456106c360b6495c16e39aa0adc0cc51cce4151c4af7c7ef3c06cb4b862517f"

RPROVIDES:${PN} += "libmca-common-sm.so.4 \
libmca-common-verbs.so.7 \
libmpi-cxx.so.1 \
libmpi-mpifh.so.12 \
libmpi-usempi-ignore-tkr.so.6 \
libmpi-usempif08.so.11 \
libmpi.so.12 \
libompi-dbg-msgq.so \
libompitrace.so.0 \
libopen-pal.so.13 \
libopen-rte.so.12 \
libopen-trace-format.so.1 \
liboshmem.so.8 \
libotfaux.so.0 \
libvt-hyb.so.0 \
libvt-mpi-unify.so.0 \
libvt-mpi.so.0 \
libvt-mt.so.0 \
libvt.so.0 \
openmpi1-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libibverbs.so.1 \
libm.so.6 \
librdmacm.so.1 \
libstdc++.so.6 \
libucp.so.0 \
libz.so.1 \
openmpi1"

inherit rpm
