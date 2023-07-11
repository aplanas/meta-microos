SUMMARY = "Development libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "b6a6c603939aa335148e20f62f595b3828f9e85398a2341812c5be5c8c672f2d2c0b6f461f5be15193d788aae8f9c7bdc6f59e35d5ba43ab1b96d60a8f54ced5"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-openmpi3-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi3-hpc-devel \
scalapack-2-1-0-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi3-hpc \
openmpi3-gnu-hpc-devel"

inherit rpm
