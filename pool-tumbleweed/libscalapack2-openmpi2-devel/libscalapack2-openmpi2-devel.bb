SUMMARY = "Development libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi2-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "116f7ff79137e5d0b84d4f5c0b73dcc38f403f778beef5c9d9c7b09c5a89a6ef6d5697a7f9f8eec039ffa518152862b22f92c10670da0c02cecaea076ba0f6a0"

RPROVIDES:${PN} += "libscalapack.so.2.1.0()(64bit) \
libscalapack2-openmpi2-devel \
libscalapack2-openmpi2-devel(aarch-64) \
scalapack-openmpi2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libmpi.so.20()(64bit) \
libscalapack2-openmpi2 \
openmpi2-devel"

inherit rpm
