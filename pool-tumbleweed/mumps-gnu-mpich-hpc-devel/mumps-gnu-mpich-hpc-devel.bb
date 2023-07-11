SUMMARY = "Dependency package for mumps_5_3_5-gnu-mpich-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mpich-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-mpich-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mpich-hpc-devel-5.3.5-3.4.noarch.rpm"
RPM_HASH = "1cbb4f50077e695faebcd9e235b13f74d1ac25bb8b595c30c998cc8d16a158e8ff91a1930c360a71e8db5eee4147a0d5707429766520c85815a5bd32bbfc9505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-mpich-hpc-devel"

inherit rpm
