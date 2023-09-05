SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi4 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi4-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "e0311f99262458a8c4bc2906bd89fce258badf06a0b48ac630695b2a5b5a8f350fe7745cdde06239b9c08e4a8d3f95ec26b5f75cb16a4ab2c31e7acfd12628bd"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
