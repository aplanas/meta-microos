SUMMARY = "SuperLU matrix solver"
DESCRIPTION = "SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "libsuperlu_6_0_1-gnu-hpc-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "c8de0c554a94e4f4c50483137cf4b1466aa3714d1fd7d45cfe2fd9d48ce5ad14fd8ec087d1d15c1df37a3b9a2c01c6449ffd68284618c28d24deb2dca4b43eba"

RPROVIDES:${PN} += "libsuperlu-6-0-1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
lua-lmod"

inherit rpm
