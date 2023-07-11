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

RPM_NAME = "mpiP_3_5-gnu-openmpi3-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "e406fea61f3ba5fedb94957e4803f67b94a9084cc8e1b10a28c5932128da5833fe955a69127b95c75fffb4bbb3596e924402e768d4803e0c65658edc0041241e"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libm.so.6 \
libopenmpi3-gnu-hpc \
libunwind.so.8 \
lua-lmod"

inherit rpm
