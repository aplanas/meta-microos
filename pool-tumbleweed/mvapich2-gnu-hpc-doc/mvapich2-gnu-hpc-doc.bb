SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-doc"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-doc provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-doc. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-doc-2.3.7-4.4.noarch.rpm"
RPM_HASH = "6596ea7c6bcb6a685d07afe93de6c6dd455426351327580f36527ad89ce9ed4e074f4b3234194f4bf13d66e536bd3259dc3d09e60fa7fd385c5e0cb1039fb15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-doc"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-doc"

inherit rpm
