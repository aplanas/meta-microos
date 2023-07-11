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

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi3-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "d4bcb15f9a94d51ca6db2a5b76df2db91d346ef806bcae92f3b332e267df4896809eff7fa69f6d701eaae8ce12e519e79c1a7982c70dd561d2a9461cb8006966"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi3-gnu-hpc \
lua-lmod"

inherit rpm
