SUMMARY = "Dependency package for hypre_2_20_0-gnu-openmpi3-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-openmpi3-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-openmpi3-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-openmpi3-hpc-devel-2.20.0-1.23.noarch.rpm"
RPM_HASH = "af7f34c337e962ef484ed4ed99e8d65c1c440b9dbc189d025ced21351f5298af4235e1b5b6b7d3c438086f6f6637eb47fc804ee3c1b77234d68df04719b74249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-openmpi3-hpc-devel"

inherit rpm
