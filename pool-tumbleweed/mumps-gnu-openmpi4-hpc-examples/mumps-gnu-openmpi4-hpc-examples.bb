SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi4-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi4-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi4-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi4-hpc-examples-5.3.5-3.3.noarch.rpm"
RPM_HASH = "7e089a7c01a248faf4c3900497aa264d366e488ea74c2bfca84b03f778cbb410f4ad21ab5a2d26888b837d71453edce11a4a8c5863eab55cccf09c5995e4f545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi4-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi4-hpc-examples"

inherit rpm
