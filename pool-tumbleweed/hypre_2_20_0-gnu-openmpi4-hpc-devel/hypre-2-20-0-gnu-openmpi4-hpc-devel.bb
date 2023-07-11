SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi4-hpc-devel-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "d99ca6400bfefce42322cfd4d36dc43558b5e5f93f1361a1df5590826f75703998812d639bf11cef152089d57447ea10014c19bb2f96093ddcafdc46f216044e"

RPROVIDES:${PN} += "hypre-2-20-0-gnu-openmpi4-hpc-devel \
pkgconfig-hypre"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libHYPRE-2-20-0-gnu-openmpi4-hpc \
libc.so.6 \
libopenblas-gnu-hpc-devel \
openmpi4-gnu-hpc-devel \
superlu-gnu-hpc-devel"

inherit rpm
