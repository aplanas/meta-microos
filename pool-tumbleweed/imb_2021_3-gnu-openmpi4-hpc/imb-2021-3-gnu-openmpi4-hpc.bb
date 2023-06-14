SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-openmpi4-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "7204bca734d494ff8b607b0b2daddbfd7c14f1692b4895a92b193e179df66180234cc5a948b36cc3788d45d3c7db369b0b0d85d8c6d4b414296c8de00f752d49"

RPROVIDES:${PN} += "imb-2021-3-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libgcc-s.so.1 \
libopenmpi4-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
