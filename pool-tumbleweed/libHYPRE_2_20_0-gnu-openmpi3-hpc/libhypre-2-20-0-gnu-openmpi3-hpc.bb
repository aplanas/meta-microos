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

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi3-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "17212d6356ee3232231966bdfee266c339b021fd5cce81650e1e8ac51a6022a10924dcf3e58919d7570b114b814ce6810c9065d8c4499b9b21f4d9fed688d8ff"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenmpi3-gnu-hpc \
lua-lmod"

inherit rpm
