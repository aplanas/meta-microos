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

RPM_NAME = "libHYPRE2_20_0-openmpi4-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "73181adaaf8b1c9dda0914bc1b1fb4de59983186321882e788ae38478cb24199a9f26bdcdabe087b6eb1240da54ce724a2fb756636a542b61205adee5b108374"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0 \
libHYPRE2-20-0-openmpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40"

inherit rpm
