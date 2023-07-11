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

RPM_NAME = "libHYPRE2_20_0-mvapich2-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "ddf9feff1e68cc8e57473663c8e8790c612daf63a564ff294db968ec4bd3d62998510336f06fddf95f365adfabcdc89bee550f085e136091e8ada058025870f4"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0 \
libHYPRE2-20-0-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
