SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE2_20_0-openmpi2-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "8f6e5ddcb9734368c4bdf492a264b101eae28f4d3a9d689dbec6a1ebb6bd420100c8903bbdf82c252c5e6ed8b58d6404061876111ea9c3f1e0c092b120e9d699"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0()(64bit) \
libHYPRE2_20_0-openmpi2 \
libHYPRE2_20_0-openmpi2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmpi.so.20()(64bit)"

inherit rpm
