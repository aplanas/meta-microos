SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi4-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi4-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi4-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi4-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "f078475be798c42b15a9caad8d5819d3a741df5e917e7ead9711a497be19f68bb1457028edcf76ce9009f457c1b08a68ab2522a30f01cab17f0696c3a05587a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-doc"

inherit rpm
