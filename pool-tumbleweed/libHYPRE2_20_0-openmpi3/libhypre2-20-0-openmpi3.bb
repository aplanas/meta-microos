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

RPM_NAME = "libHYPRE2_20_0-openmpi3-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "90b3264276f2a3852acae58eda7aeae1227358cc523c1c172bcbfcd57fcccdf648ad6937b7d558dfae25a38851edbbd229cd5c1cc68429c2b0d776262b147534"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0()(64bit) \
libHYPRE2_20_0-openmpi3 \
libHYPRE2_20_0-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmpi.so.40()(64bit)"

inherit rpm
