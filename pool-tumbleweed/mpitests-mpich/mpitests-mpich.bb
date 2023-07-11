SUMMARY = "MPI Benchmarks and tests for mpich"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mpich-3.2-11.4.aarch64.rpm"
RPM_HASH = "0866ec68b845e0992740b54fbcace08db6195617490ab0a927bfef075e10eedcc1ffca37c374436532e27d7fcc7142bb3dd837c54f02f178b430a628b10f03ce"

RPROVIDES:${PN} += "mpitests-mpich"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmpi.so.12 \
libstdc++.so.6 \
mpich \
mpitests"

inherit rpm
