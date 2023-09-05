SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi2-hpc-devel-2.20.0-1.24.noarch.rpm"
RPM_HASH = "fa6ce43f7f3e3c5e07d483410c46c9bd231e7acb1bf2a9be3a5250d7eed60584707eaf47be0d9162b678dcd7524f3dcb79c0c7a02d058addef969bd4548adcff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi2-hpc-devel"

inherit rpm
