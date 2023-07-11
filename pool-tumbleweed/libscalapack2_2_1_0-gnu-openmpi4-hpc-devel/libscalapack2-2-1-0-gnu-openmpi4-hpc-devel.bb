SUMMARY = "Development libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "ad6e3ad7e8963d29e1624ad548a404d223e3df51c639a646ad95760c9dc4a131be02c58990b0f3581fd56a4b2809d6367cd878c86287009207c018394dc98d1b"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-openmpi4-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi4-hpc-devel \
scalapack-2-1-0-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi4-hpc \
openmpi4-gnu-hpc-devel"

inherit rpm
