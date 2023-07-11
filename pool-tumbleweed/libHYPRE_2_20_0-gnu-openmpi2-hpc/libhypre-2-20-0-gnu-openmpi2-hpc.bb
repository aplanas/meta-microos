SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi2-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "dc1333fd8759d674849bfe18ed3d7135b2909e42133d262d36a469eb2af0e3ddf7d0eb341fd2cf773b8ebec2f66e89b0a6628427c5c5d5ea56481a99692007e7"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
