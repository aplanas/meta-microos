SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mpich shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-mpich-hpc-2.20.0-1.25.aarch64.rpm"
RPM_HASH = "be83018a113d6482298d4d1c930eff73bb079caf06a8b239908de294cdce478b3efbd3efb1387a03e060b5ed4412e4f9102306f8877d8deeb0ce29610907f80b"

RPROVIDES:${PN} += "libHYPRE-2-20-0-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
