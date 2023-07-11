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

RPM_NAME = "libHYPRE2_20_0-openmpi3-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "1678bb3bbcdcf21f8a06e880fc8a7a79cc96723401747227e1e4d3b388038bfe531cd4aa622a8ac914c907a0681fa17f13039e86323bb55cc8051fd3c68ba8f5"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0 \
libHYPRE2-20-0-openmpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40"

inherit rpm
