SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi1-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi1-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi1-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi1-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "13b16eb2851d0d63a5167bda0ebec120a03203a9e95c2c763ee95a58b0e16d0f09a94a97f4e6ad958e1f64dfd4c6f7d145b4eab0247eb45473499fd4814a1f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-doc"

inherit rpm
