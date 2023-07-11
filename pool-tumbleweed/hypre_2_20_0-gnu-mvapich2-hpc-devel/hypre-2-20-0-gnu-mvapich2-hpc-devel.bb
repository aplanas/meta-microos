SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mvapich2-hpc-devel-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "fb5e9f236fa15bfaffcaac523ec56ef8a709a6049b5f107ce741875a6edd2db0c9c80f8452be2fc51a27d23c9ec169c16b7d1a5456e9f09768f49c120904b2db"

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
