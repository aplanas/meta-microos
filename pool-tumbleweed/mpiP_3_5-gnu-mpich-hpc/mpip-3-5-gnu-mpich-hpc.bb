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

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "496df76780faca4683c920a3d4016d0ef41a6fa3ebffb392a80371ebd75783648c0fd764fe7234764b510b7de7c28f3ff8025a80189e7fed5165960db3fa9cfe"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libunwind.so.8 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
