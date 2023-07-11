SUMMARY = "Dependency package for mumps_5_3_5-gnu-mvapich2-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mvapich2-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mvapich2-hpc-devel-5.3.5-3.4.noarch.rpm"
RPM_HASH = "692b815e6265b99996966ea2db6be12f5203208d9313b1bc92c34b2ce68dfd738e8d0fbcf5f9220ece419107ed4d10e023cb19974ed0eef8772a1ebcbbcdd09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-mvapich2-hpc-devel"

inherit rpm
