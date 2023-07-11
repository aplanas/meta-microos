SUMMARY = "MPI Benchmarks and tests for openmpi1-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi1-gnu-hpc-3.2-11.4.aarch64.rpm"
RPM_HASH = "e1e9bdd6939867c769b9a1d3df06dbfdd4675664184453a4cef744005f488748a2ea51a93a5ae44f2c035b38a85eb32f744e17acc31fdab930a7575012d588a0"

RPROVIDES:${PN} += "mpitests-openmpi1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi-cxx.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpitests \
openmpi1-gnu-hpc"

inherit rpm
