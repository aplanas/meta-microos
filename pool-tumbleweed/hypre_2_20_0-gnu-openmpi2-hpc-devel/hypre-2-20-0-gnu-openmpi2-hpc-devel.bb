SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi2-hpc-devel-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "7343e91f94f9d425110addd1e540fbd396111983cfc94b4da673facbe5c58bdfe52a017b0ba1e99fa56e63b0df74242a66a8b0a02aee81480380e8052094d7ea"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi2-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi2-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi2-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
