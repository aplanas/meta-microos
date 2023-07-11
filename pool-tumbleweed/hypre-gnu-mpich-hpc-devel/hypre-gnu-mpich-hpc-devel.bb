SUMMARY = "Dependency package for hypre_2_20_0-gnu-mpich-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mpich-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mpich-hpc-devel-2.20.0-1.24.noarch.rpm"
RPM_HASH = "34890807d860bb452f541bd0fde087df979325b1cdea544c9190ae43611a5dbae32f32caf91a02535c871d684fdd0ade816a11d69208ea6e833232d5e909a9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hypre-2-20-0-gnu-mpich-hpc-devel"

inherit rpm
