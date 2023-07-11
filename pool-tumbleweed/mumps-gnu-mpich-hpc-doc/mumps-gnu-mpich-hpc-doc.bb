SUMMARY = "Dependency package for mumps_5_3_5-gnu-mpich-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mpich-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-mpich-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mpich-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "0aff9c20cd9d34d34c8dd18de2c7aef72c2ba22e53a67537d8dc34a7f3a5d355d809cc37d2d9951d6ff1d27c8f0476d89ffbaed22d9cb963a3c8e42ea5821a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-mpich-hpc-doc"

inherit rpm
