SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi1-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi1-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi1-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi1-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "4ec4894489873dcf799cb931eb31c2ea3a815dcc8e7d5385c2d34d23f04b71c2be580458c0cce903c553f0bcbecd020d8821312900ff1d03f0215d017d4d5390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += "mumps_5_3_5-gnu-openmpi1-hpc-doc"

inherit rpm
