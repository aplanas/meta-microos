SUMMARY = "Development libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains development libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-mvapich2-hpc-devel-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "44fbd7683ff2ab584e896501354ad69b4a1cc9566b356f8c1a56e9afcb7a56b8e295d0e8322f57d1e990a089b1660f4f2e32b9a21696df157cae8decd942e91f"

RPROVIDES:${PN} += "libblacs2-2-1-0-gnu-mvapich2-hpc-devel \
libscalapack2-2-1-0-gnu-mvapich2-hpc-devel \
scalapack-2-1-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libscalapack2-2-1-0-gnu-mvapich2-hpc \
mvapich2-gnu-hpc-devel"

inherit rpm
