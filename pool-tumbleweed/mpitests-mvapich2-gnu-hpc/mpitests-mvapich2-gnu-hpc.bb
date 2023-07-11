SUMMARY = "MPI Benchmarks and tests for mvapich2-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-gnu-hpc-3.2-11.4.aarch64.rpm"
RPM_HASH = "b0d8dd71a58ef772bb2b3d55340aa27f0af85c436c3cab297519cf4accd1a63ad735a4d3e2d999e92485bbc40c6ac0d7b1b5cc3f3a48f9d5c15ab6841ee94238"

RPROVIDES:${PN} += "mpitests-mvapich2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
mvapich2-gnu-hpc"

inherit rpm
