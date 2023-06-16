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

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-3.5-3.2.aarch64.rpm"
RPM_HASH = "5b16fa71821b94dedec6aa93df7c9e2fe906eb85b1c19fa7283967465ae0e3a8e7ba51460305855717b7bcabce771637ff3d36fd72169c0566ffa61e30a8c801"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libm.so.6 \
libopenmpi4-gnu-hpc \
libunwind.so.8 \
lua-lmod"

inherit rpm
