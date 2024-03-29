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

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-3.5-3.4.aarch64.rpm"
RPM_HASH = "ab867d60cc7b8c46a87228bd9985c1c7b546a62f82c2bcb7b93ff72f9ed5d2046f40ded74a520481efdaff57d3d2372972ef63d4d776f9695243c32dda911abd"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libm.so.6 \
libopenmpi1-gnu-hpc \
libunwind.so.8 \
lua-lmod"

inherit rpm
