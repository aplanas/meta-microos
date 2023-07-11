SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-openmpi2-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-openmpi2-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-openmpi2-hpc-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "5c6e372180dffbb980a9b538e04979d77eaa3faae705b3f82c78b77cedb2274fdb09ce02bf6e14ef1a9094982029de8fde34622f8dfa8aa7c67024b861bfb5ce"

RPROVIDES:${PN} += "libtrilinos-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-14-0-0-gnu-openmpi2-hpc"

inherit rpm
