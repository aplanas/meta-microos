SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi3-hpc-2021.3-1.3.aarch64.rpm"
RPM_HASH = "926bbdce87a4d761cfb6cb5485ac9bd6ee24069223b20b151234aa2486f5cc26a8cc5f1ae7e61f0323aff7e98acf8b927372d583f106985a171f6b024dfea324"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi3-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
