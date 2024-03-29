SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-openmpi3-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-openmpi3-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi3-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-openmpi3-hpc-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "2ba4ad008c44a80e472176bfea8e3c136876dd9e30d2d1c8d77663a87bd94895e11ac2b9b8321b046b5edfa0491aa325c84ae0d259f93a06c12df902d6f82e06"

RPROVIDES:${PN} += "libtrilinos-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-14-0-0-gnu-openmpi3-hpc"

inherit rpm
