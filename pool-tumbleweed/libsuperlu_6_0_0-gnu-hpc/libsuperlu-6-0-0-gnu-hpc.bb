SUMMARY = "SuperLU matrix solver"
DESCRIPTION = "SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "libsuperlu_6_0_0-gnu-hpc-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "9ae759da4d1a6f7b603b37750a3229e45d027765df319d4c2200db060c6c07afc25562009886e51ef9a2d21272fde03253e74d733330d2dd2fe0139a11261738"

RPROVIDES:${PN} += "libsuperlu_6_0_0-gnu-hpc \
libsuperlu_6_0_0-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
lua-lmod"

inherit rpm
