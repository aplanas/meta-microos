SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi2-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi2-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi2-hpc-devel-5.3.5-3.3.noarch.rpm"
RPM_HASH = "9d5dc4372c6a830aebe2c6beacc06191a0bea5a5d63c0e7da2fb5ea9889fee4afa1597e70f856ece7b498594e52425bcfa03189e5453fa1b067b9fba6cb4c4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
mumps-5-3-5-gnu-openmpi2-hpc-devel"

inherit rpm
