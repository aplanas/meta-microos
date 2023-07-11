SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi2-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi2-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-openmpi2-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi2-hpc-examples-5.3.5-3.4.noarch.rpm"
RPM_HASH = "c0defaeada8ccea90bdfbbca56d7126719881f304cf0790391f92cb2cf732b9fb6f438f6793985487a8752a90f90e3cf212b5d1a982c6cd796bc8612c48dfe12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi2-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi2-hpc-examples"

inherit rpm
