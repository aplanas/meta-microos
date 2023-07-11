SUMMARY = "Development libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi1-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "3bfe884a0e302bbf6aa45382ef955367358516bbcc1e67019aa4d34149e0009ee45f21596f65471a1d9d7494aaa1b7afc264087be22283ec20e5207ab333bb40"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-openmpi1-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi1-hpc-devel \
scalapack-2-1-0-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi1-hpc \
openmpi1-gnu-hpc-devel"

inherit rpm
