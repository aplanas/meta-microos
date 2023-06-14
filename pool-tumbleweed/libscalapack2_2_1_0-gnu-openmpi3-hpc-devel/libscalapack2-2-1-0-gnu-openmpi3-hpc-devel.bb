SUMMARY = "Development libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel-2.1.0-9.18.aarch64.rpm"
RPM_HASH = "942ca07ac86b9caf3d3b4f00cb7495f67ec8e8a93b0ea4f0c3bb87c13efc38d416c8fe9e7283e8840c1cc44bb89b04f2ebb4539d4e73a9e505d5c662ac4dd48a"

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
