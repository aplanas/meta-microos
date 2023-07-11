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

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-3.5-3.3.aarch64.rpm"
RPM_HASH = "3b09f968b53206427292d897a614b0c1cd43426b6d4186c9e0a3fabc01a9dc875ef55e7d3dea384b73c4b9a1e90efbc4a1d11838284c8557bc307a988676e703"

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
