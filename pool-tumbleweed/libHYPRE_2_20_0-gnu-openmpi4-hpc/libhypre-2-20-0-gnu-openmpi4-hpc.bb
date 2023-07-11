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

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi4-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "1a816aedf3073196b9c3edb92a73eee6876949ca0e55581065dff257569f43c6cec0259952b7e595c428fa4a9ae53e77fff6b1136950840dbcfbdd5bc1bd82e2"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
