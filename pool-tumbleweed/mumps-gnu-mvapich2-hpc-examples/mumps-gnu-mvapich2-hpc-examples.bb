SUMMARY = "Dependency package for mumps_5_3_5-gnu-mvapich2-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mvapich2-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-mvapich2-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mvapich2-hpc-examples-5.3.5-3.4.noarch.rpm"
RPM_HASH = "ed9fe7cfbcbc2f5b341e2a9563acb7abdd2155972f0b3f2da21d34e8a1d61155b596faab8b1f9cf1c7b7f3ebaf34192e0f5a49828d87b439ba5184b50d6b2504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mvapich2-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh \
mumps-5-3-5-gnu-mvapich2-hpc-examples"

inherit rpm
