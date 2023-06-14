SUMMARY = "Dependency package for mumps_5_3_5-gnu-openmpi4-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-openmpi4-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-openmpi4-hpc-devel-5.3.5-3.2.noarch.rpm"
RPM_HASH = "268c51143097b370ede8a71bb09b44924b0ecae642bad98f103fe763189be6de5eb80b59b891f7c1267585aaa3f2748a7cf0242b6e450c8f7d7f332c3d92f2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
mumps-5-3-5-gnu-openmpi4-hpc-devel"

inherit rpm
