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

RPM_NAME = "mpiP_3_5-gnu-openmpi2-hpc-3.5-3.4.aarch64.rpm"
RPM_HASH = "f3a3193ff3461dcc8e0290bb7e35d8401676bb5720665f585a96e3c2437ea75394989a355ea547079d60619f03aeae3808468ef16fc3ec907033820001ad00c6"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libm.so.6 \
libopenmpi2-gnu-hpc \
libunwind.so.8 \
lua-lmod"

inherit rpm
