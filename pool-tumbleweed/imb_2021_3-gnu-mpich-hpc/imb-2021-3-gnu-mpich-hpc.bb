SUMMARY = "Intel MPI Benchmarks (IMB)"
DESCRIPTION = "The Intel MPI Benchmarks (IMB) perform a set of MPI performance \
measurements for point-to-point and global communication operations for \
a range of message sizes."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb_2021_3-gnu-mpich-hpc-2021.3-1.2.aarch64.rpm"
RPM_HASH = "d7993237fb2cfd1b26064e46bdf1a57ca600cda2e6e849f84c3d667770ba78e382d210227aa86c1ccb01519c0307eed1f00e72d2cf42d6596e4a355270eed9db"

RPROVIDES:${PN} += "imb_2021_3-gnu-mpich-hpc \
imb_2021_3-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
