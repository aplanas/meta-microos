SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mvapich2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mvapich2-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "661b775c6e226a74cc58c966fbabe66ef16ad489272ae78a1c05a6f286c9a1a60d67e3824967365259174041c6aa4316d5d35c4e273f65db631cacd4fefd39fa"

RPROVIDES:${PN} += "libHYPRE-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-mvapich2-hpc"

inherit rpm
