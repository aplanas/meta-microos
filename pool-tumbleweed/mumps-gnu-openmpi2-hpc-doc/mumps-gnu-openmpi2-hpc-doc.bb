SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi2-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi2-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi2-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi2-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "a2d9cf95de7ab9d97f24202c9e11b7c065379632a23220c2362f290b5373c5629121795daf5e38e8c4710db0e21d8707854bd028c0a13558d9a28fb39a838242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-doc"

inherit rpm
