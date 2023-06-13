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

RPM_NAME = "libHYPRE2_20_0-openmpi4-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "91d308c1e4641b9a0c85d4e70e3567851c39fd8228d0ace896f1cf01cdc21df1ee0049039291b049e995fa2f23ae8e093ac6e3235db6f5de32fa80292a5dc5f9"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0()(64bit) \
libHYPRE2_20_0-openmpi4 \
libHYPRE2_20_0-openmpi4(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmpi.so.40()(64bit)"

inherit rpm
