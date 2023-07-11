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

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-3.5-3.4.aarch64.rpm"
RPM_HASH = "ebfefa9e03583583ae374632be0db7ba1e16a503b48e9cd3f0a98a0d96d8697ef1cc50a7d525e6539cdcd5741ba5f7f720c9a9c9fbf8d797bfd5d165a07d11dc"

RPROVIDES:${PN} += "mpiP-3-5-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libunwind.so.8 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
