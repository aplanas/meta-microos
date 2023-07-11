SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi2-hpc-2021.3-1.3.aarch64.rpm"
RPM_HASH = "80cf84d923c42044c2db78f9d22b9eaa0285aa61f4e0dd5475cfb2302248843eb0e7158d8c0972f04b1645787f90e832cf81d0f90e6426ed31cf1e82fda5e341"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi2-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
