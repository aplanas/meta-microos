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

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-3.5-3.2.aarch64.rpm"
RPM_HASH = "09be8a8df5275172c37a20470da5151ad0b8463052dacf7243eefb415eb1f3ffc2e6ceb3e29fe2c0885470791182964b97af8138c4a752a93f626f145556eae0"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi3-hpc \
mpiP_3_5-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenmpi3-gnu-hpc \
libunwind.so.8()(64bit) \
lua-lmod"

inherit rpm
