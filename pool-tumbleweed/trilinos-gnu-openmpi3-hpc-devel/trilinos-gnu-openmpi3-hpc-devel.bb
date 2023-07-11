SUMMARY = "Dependency package for trilinos_14_0_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-openmpi3-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi3-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-openmpi3-hpc-devel-14.0.0-1.3.noarch.rpm"
RPM_HASH = "74d3452f98119bdd257ab2fbaf1121801b4ef99cf386fefe3c25a22591f95e793754a7365f00ca4fc25b5bb844f546407afd0c8c409c8b2e412d522a9e1e5c1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-openmpi3-hpc \
trilinos-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
trilinos-14-0-0-gnu-openmpi3-hpc-devel"

inherit rpm
