SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi1-hpc-2021.3-1.3.aarch64.rpm"
RPM_HASH = "2d9cb089b82faf262cb3eaff260705162678304d420edaa80b39233598902ed6598d55496e377c2569c57d3eff57571589ed71bb25ee7fd14508ea3c1f34ac52"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi1-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
