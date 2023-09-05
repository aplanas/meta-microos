SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mvapich2-hpc-devel-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "45dba15dc8fb902349788d2d97c09f35cbc48b45f903d4abb0d03f5ee1165a5208841d3cf54548261ec4e6712a30def509ca96f946934e02884a24f1055b8376"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-mvapich2-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-mvapich2-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
mvapich2-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
