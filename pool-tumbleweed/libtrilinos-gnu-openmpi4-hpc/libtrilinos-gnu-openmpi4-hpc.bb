SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-openmpi4-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-openmpi4-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi4-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-openmpi4-hpc-14.0.0-1.3.aarch64.rpm"
RPM_HASH = "5389d822e12da30481d728236ef12051872bfad29475cc030c4136ca3e4b620ac64156e91847b1eaf419d6d8e47f33756d8f2774508e1729af4b953cb8e5603c"

RPROVIDES:${PN} += "libtrilinos-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libtrilinos-14-0-0-gnu-openmpi4-hpc"

inherit rpm
