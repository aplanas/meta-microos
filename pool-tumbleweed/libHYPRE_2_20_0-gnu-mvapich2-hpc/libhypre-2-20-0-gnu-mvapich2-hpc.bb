SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mvapich2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-mvapich2-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "4438c005d04520990f3482348b3cfcfed2ce844b0a048868e9cb72f504f573f174d28fd1287d49c9bf37c8cbe81307f1a89e26c0c27473e80b58db59d6450fe7"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
