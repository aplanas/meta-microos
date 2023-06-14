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

RPM_NAME = "libHYPRE2_20_0-mpich-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "b5d1c1318cbbd853778fe35ebf83227d5b82cd4c4baf7b57bb58f20f2b778819b8cbfb747ad8e18f791fe3c4b0c2ee17723296542ba81fe8310694274fef6560"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0 \
libHYPRE2-20-0-mpich"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
