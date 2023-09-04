SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-doc"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-doc provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-doc. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-doc-2.3.7-5.1.noarch.rpm"
RPM_HASH = "3d22ab25de23d7d6da42eeac396ab057f6b3e4d11e37941e0a4144ec91b3222241fd1416f5634083bc192fd3f11101a753d0a96307ebd1e4af99c6e68889b42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-doc"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-doc"

inherit rpm
