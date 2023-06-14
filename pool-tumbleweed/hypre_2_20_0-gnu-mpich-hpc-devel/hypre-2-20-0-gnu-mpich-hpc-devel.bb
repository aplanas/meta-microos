SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mpich-hpc-devel-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "968a99b34c75bf09883466e5c03d46cdbdc995ee50f3d48834487a88a672ab13ad327aff7308f2c7ab4ab94b0ace9e6b90981b7d075dc40391693b9d0e430177"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-mpich-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-mpich-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
mpich-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
