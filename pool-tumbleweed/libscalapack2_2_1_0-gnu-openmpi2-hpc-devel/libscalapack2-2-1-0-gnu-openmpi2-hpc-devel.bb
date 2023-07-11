SUMMARY = "Development libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi2-hpc-devel-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "4664ef9ac3932963660758e524d0e5703f6aac340af33bf101a7e6acd4bf369f5bb6091d78782c16d58a63e760705bf1474a344e3da7fb61acccf83efdb22b47"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-openmpi2-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi2-hpc-devel \
scalapack-2-1-0-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-openmpi2-hpc \
openmpi2-gnu-hpc-devel"

inherit rpm
