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

RPM_NAME = "mpiP_3_5-gnu-mvapich2-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "3e9f834a38a9c6d88612ed667a13a3c58f4f99621c84d8f64e7fe53ee4862d6edc66edee3e90ef614aeac86210b4efb1bd750542b622ae487bdfc6356418d8d3"

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
