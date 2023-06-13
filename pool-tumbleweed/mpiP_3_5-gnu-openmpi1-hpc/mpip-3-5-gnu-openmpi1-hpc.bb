SUMMARY = "A profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
It only collects statistical information about MPI functions, so mpiP \
generates less overhead and much less data than tracing \
tools. All the information captured by mpiP is task-local. It only \
uses communication during report generation, typically at the end of \
the experiment, to merge results from all of the tasks into one output \
file."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "786aab1d36e326c1d2f3d0806301105909c052b44d73318b829b26ce26bf1643ec70de2e0ba7ea8936664dcbbda550978a6808493bef0e427f27766a839fddee"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi1-hpc \
mpiP_3_5-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenmpi1-gnu-hpc \
libunwind.so.8()(64bit) \
lua-lmod"

inherit rpm
