SUMMARY = "Dependency package for trilinos_14_0_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package trilinos-gnu-openmpi2-hpc-devel provides the dependency to get binary package trilinos_14_0_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-openmpi2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "trilinos-gnu-openmpi2-hpc-devel-14.0.0-1.2.noarch.rpm"
RPM_HASH = "221736bfd0bda6ca932cf529f97fd8ffc021e4009fe3edfc79a3c67188af5d0ea0faffcd3eb901a42a03e627d28515d91f9d5ebf55750ac2ba4edbaca316dfb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trilinos-gnu-openmpi2-hpc \
trilinos-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
trilinos_14_0_0-gnu-openmpi2-hpc-devel"

inherit rpm
