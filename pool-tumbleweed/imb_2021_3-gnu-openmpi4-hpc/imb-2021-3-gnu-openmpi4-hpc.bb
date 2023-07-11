SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi4-hpc-2021.3-1.3.aarch64.rpm"
RPM_HASH = "d7dfd35567af3f3ec7974eb35fa514d228a35b2b378fbd0c1d6318f08da2caa2040df5ad6c893bbc0610379071ce1a7070ad00f83caeddb5ab713d4251246b68"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi4-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
