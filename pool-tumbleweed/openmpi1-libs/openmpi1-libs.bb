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

RPROVIDES:${PN} += "libmca_common_sm.so.4()(64bit) \
libmca_common_verbs.so.7()(64bit) \
libmpi.so.12()(64bit) \
libmpi_cxx.so.1()(64bit) \
libmpi_mpifh.so.12()(64bit) \
libmpi_usempi_ignore_tkr.so.6()(64bit) \
libmpi_usempif08.so.11()(64bit) \
libompi_dbg_msgq.so()(64bit) \
libompitrace.so.0()(64bit) \
libopen-pal.so.13()(64bit) \
libopen-rte.so.12()(64bit) \
libopen-trace-format.so.1()(64bit) \
liboshmem.so.8()(64bit) \
libotfaux.so.0()(64bit) \
libvt-hyb.so.0()(64bit) \
libvt-mpi-unify.so.0()(64bit) \
libvt-mpi.so.0()(64bit) \
libvt-mt.so.0()(64bit) \
libvt.so.0()(64bit) \
openmpi1-libs \
openmpi1-libs(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_1.0)(64bit) \
libibverbs.so.1(IBVERBS_1.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librdmacm.so.1()(64bit) \
librdmacm.so.1(RDMACM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libucp.so.0()(64bit) \
libz.so.1()(64bit) \
openmpi1"

inherit rpm
