SUMMARY = "MPI Benchmarks and tests for openmpi4-gnu-hpc"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-openmpi4-gnu-hpc-3.2-11.2.aarch64.rpm"
RPM_HASH = "918c0fcb9845fc663bc6478d86131f8be3063d0347338b2f589136764eb28751a679c2ffa524ef5f302ae36b1336c4a8f047863d896de59574e18071602c8804"

RPROVIDES:${PN} += "mpitests-openmpi4-gnu-hpc \
mpitests-openmpi4-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit) \
mpitests \
openmpi4-gnu-hpc"

inherit rpm
