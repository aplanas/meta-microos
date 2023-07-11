SUMMARY = "MPI Benchmarks and tests for mpich-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-gnu-hpc-3.2-11.4.aarch64.rpm"
RPM_HASH = "f00933bc332b53cdd6212585b5968ed6a8206f9d5780809e413b02d40f6c9abc23f393e317c8ee5084daa0c140bfa5096a0e16e2bea870e0dc3eb015b61360bb"

RPROVIDES:${PN} += "mpitests-mpich-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpich-gnu-hpc \
mpitests"

inherit rpm
