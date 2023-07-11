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

RPM_NAME = "libHYPRE2_20_0-mpich-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "46441a528ae43ce5284e86ae4ffb32fc68901e334274fed7fab5d48293be56c18fd8f517f0c687cacf284f0442d6dc6bcf84411518e23e04ebaa180725865196"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0 \
libHYPRE2-20-0-mpich"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
