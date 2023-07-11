SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi2-hpc-doc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi2-hpc-doc provides the dependency to get binary package mumps_5_3_5-gnu-openmpi2-hpc-doc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi2-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "48a4a8cc39b9601846f3b57c2eded885d0b85762f346622daddce5953388b2db04459281d27f346c84ccdedabaebc1b4fd2deb4cd285a8d77e750d737a2a4ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-doc"

inherit rpm
