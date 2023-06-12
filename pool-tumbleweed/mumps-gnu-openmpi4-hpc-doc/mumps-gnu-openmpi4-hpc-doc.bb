SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi4-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi4-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi4-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi4-hpc-doc-5.3.5-3.2.noarch.rpm"
RPM_HASH = "b78d4d87b87c633f6aaff00b3df0722ec6cacb5776d447c95e0c372d5ec81c790a69074446cfc733c05580f36dc4068379b04d7dfe8df1a73bee1a10e2366c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi4-hpc-doc"
RDEPENDS:${PN} += "mumps_5_3_5-gnu-openmpi4-hpc-doc"

inherit rpm
