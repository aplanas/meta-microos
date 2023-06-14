SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi2-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi2-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi2-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi2-hpc-examples-5.3.5-3.3.noarch.rpm"
RPM_HASH = "870c74e64692992921607ebbcab442184b350771d428a68857232ebf487606544a7efdc5575d0dfb3167756d14cab41c66a681730dd587696b457d72fa5f2a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi2-hpc-examples"

RDEPENDS:${PN} += "/bin/sh \
mumps-5-3-5-gnu-openmpi2-hpc-examples"

inherit rpm
