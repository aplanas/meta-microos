SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi1-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi1-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi1-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi1-hpc-examples-5.3.5-3.4.noarch.rpm"
RPM_HASH = "6736cd52c03e62a0e31e273fd51dc9064f2a68b705bc57841fcd7902643f947cb04bdcf3043b87b5955288fcf5966d1424b4deef406ff1ed5e8b0a691cf6976b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi1-hpc-examples"

inherit rpm
