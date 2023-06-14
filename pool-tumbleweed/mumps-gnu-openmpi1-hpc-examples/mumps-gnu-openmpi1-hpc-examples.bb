SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi1-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi1-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi1-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi1-hpc-examples-5.3.5-3.3.noarch.rpm"
RPM_HASH = "2a3e877cd061568920f4311c47eb6be332bf081961c801ca922bad6e966b47c24e68bd36507b01375e2d3cf99f9220cf26978a376a374cd1715c28f8a13c28f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
mumps-5-3-5-gnu-openmpi1-hpc-examples"

inherit rpm
