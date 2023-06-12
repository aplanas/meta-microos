SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi3 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi3-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "bb80f0c2711bc286eaaf0f3d33740a936fe9cac65e7bcf7bee2d8003ed3e2ed6148d3c5c305ea59d817b6a8b0e1a315f77130bd33a8f12f081bbc2ee2e739481"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-openmpi3-hpc \
libHYPRE_2_20_0-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libopenmpi3-gnu-hpc \
lua-lmod"

inherit rpm
