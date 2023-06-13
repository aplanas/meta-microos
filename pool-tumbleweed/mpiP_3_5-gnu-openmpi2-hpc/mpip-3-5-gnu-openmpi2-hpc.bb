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

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "5810164d7e8cea62ffee760d5b41c7a22761ae5558f427b887246dfe4f05684777b73d96077fee33e5eb3222047feea39be7480ba4ee9b7f3cea61f5113519ad"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi2-hpc \
mpiP_3_5-gnu-openmpi2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenmpi2-gnu-hpc \
libunwind.so.8()(64bit) \
lua-lmod"

inherit rpm
