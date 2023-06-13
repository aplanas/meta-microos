SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi1 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE2_20_0-openmpi1-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "9983853a78f7b187b31b7e6aafd1c6aa529e5400d7437b266c7be627bb0ccbf4a315e5814c9c566cbf221a407d53539997c90e2f5bac45f34f65cf5dc963d451"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0()(64bit) \
libHYPRE2_20_0-openmpi1 \
libHYPRE2_20_0-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
