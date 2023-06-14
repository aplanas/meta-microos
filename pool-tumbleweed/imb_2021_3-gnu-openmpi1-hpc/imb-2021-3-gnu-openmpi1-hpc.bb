SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi1-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "b7390c393e5dde5944194c45fccb58b51f620d12caf2e76bdf431ca78cc673023f34eddef43772d365a480b12553fd7cf297201e21e2c1452adec8158e773e7e"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi1-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
