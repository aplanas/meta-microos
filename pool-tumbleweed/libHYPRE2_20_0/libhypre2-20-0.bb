SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains serial shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE2_20_0-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "ef2513c23f0b30a3ba943e29fd862a6db7077b0c1ab335fc4d46ede3972f97c4e88e48f82af8bfdfc684413ba502c1f88793446fd07fce5364e1c999a3639785"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0 \
libHYPRE2-20-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
