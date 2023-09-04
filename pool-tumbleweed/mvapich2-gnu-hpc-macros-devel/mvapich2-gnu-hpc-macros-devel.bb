SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-macros-devel"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-macros-devel provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-macros-devel-2.3.7-5.1.noarch.rpm"
RPM_HASH = "aa30464b1eeec22cb29ccef64837778d39bd115e6fd24c688dcf265678578b1a3dc552cd19ea0ed10ededf16a1cbc6bf02e6ecf55e7c9227916f779c5f9fac87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-macros-devel"

inherit rpm
