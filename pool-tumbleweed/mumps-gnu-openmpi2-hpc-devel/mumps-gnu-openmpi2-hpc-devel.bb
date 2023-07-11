SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi2-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi2-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi2-hpc-devel-5.3.5-3.4.noarch.rpm"
RPM_HASH = "c942ee4ac319a0ff75ccdc3b9fedc96db5d061a55e1bbfa8e287097e90a788cc25f29629cf83bbe26a83bc460f37d8e4668335447f72e030481ea90e859fbe5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi2-hpc-devel"

inherit rpm
