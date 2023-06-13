SUMMARY = "MPI Benchmarks and tests for mpich-ofi"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-ofi-3.2-11.3.aarch64.rpm"
RPM_HASH = "4c41775841ec990db63bc060e30dc8bfa18384f31e8c6f1890d8415b6b4a0fd79886e949c277b37533ffe85476f9a3b51d33faca48d106cce5ff870a13b9ed7e"

RPROVIDES:${PN} += "mpitests-mpich-ofi \
mpitests-mpich-ofi(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.12()(64bit) \
libstdc++.so.6()(64bit) \
mpich-ofi \
mpitests"

inherit rpm
