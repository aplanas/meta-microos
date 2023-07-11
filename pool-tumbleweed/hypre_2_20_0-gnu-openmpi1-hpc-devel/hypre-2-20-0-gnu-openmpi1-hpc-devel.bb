SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi1 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi1-hpc-devel-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "6863c59ae6b2279c953db3923678d8725f45a3cae697285d35aa104b29ec6c3a0f502c1ba62a455005c813730ea716c8e493a6ee404bd595847057fcab2fce54"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi1-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi1-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi1-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
