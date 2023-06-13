SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi1 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi1-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "6bdc78ddc68e355f2794adb7139b5a83a2236994f1eb5ef270238a5998bc068b282231b45cb15fffc376095838c365a61a453ac1f95d340a41ddb23384a5a2d6"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-openmpi1-hpc \
libHYPRE_2_20_0-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libopenmpi1-gnu-hpc \
lua-lmod"

inherit rpm
