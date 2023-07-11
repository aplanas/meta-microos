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

RPM_NAME = "mpiP_3_5-gnu-mpich-hpc-3.5-3.4.aarch64.rpm"
RPM_HASH = "503cd423c20057f13d52eabd37ce554bb2b37cfd290f2b2ef56aed30efd9e9b63385e5b28691ecd7917f6a08567e1e81de3bdc633c090b56bc3c535cb7dd6a70"

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
