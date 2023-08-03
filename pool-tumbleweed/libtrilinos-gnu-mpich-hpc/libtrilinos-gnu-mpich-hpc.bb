SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-mpich-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-mpich-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-mpich-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-mpich-hpc-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "67a961688025c63ddcb811e17c1afdc835594249f821eb99e9c07c5053665bb2bab85c786a2bffe01eef25b132f6ac1c5a5453e5f49b4b26c70db4b34950a090"

RPROVIDES:${PN} += "libtrilinos-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-14-0-0-gnu-mpich-hpc"

inherit rpm
