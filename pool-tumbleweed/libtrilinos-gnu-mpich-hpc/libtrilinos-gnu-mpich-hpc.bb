SUMMARY = "Dependency package for libtrilinos_13_2_0-gnu-mpich-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-mpich-hpc provides the dependency to get binary package libtrilinos_13_2_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of trilinos_13_2_0-gnu-mpich-hpc."
LICENSE = "LGPL-2.0-only"

PV = "13.2.0"

RPM_NAME = "libtrilinos-gnu-mpich-hpc-13.2.0-5.3.aarch64.rpm"
RPM_HASH = "9fda0fb35c90f3e5157bbe2e9c3128fd7bcc2a094a55e05ab027589436899b880ce54ebebd1dc8181993e5c02734304fe63dc7dbde536d034f16b2be024dd320"

RPROVIDES:${PN} += "libtrilinos-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-13-2-0-gnu-mpich-hpc"

inherit rpm
