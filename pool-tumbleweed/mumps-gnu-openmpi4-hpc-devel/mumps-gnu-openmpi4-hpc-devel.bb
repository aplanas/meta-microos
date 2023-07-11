SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi4-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi4-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi4-hpc-devel-5.3.5-3.3.noarch.rpm"
RPM_HASH = "4513ec5dd7d70ecbddb57a6452f7fae1eba83377fff79fab2511756d4e6610d9811526fd121356e2ad3909c1d8f5182f1d08ce240b566fef701a1311cd5d2504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-openmpi4-hpc-devel"

inherit rpm
