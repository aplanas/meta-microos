SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-macros-devel"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-macros-devel provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-macros-devel-2.3.7-4.3.noarch.rpm"
RPM_HASH = "3941a68c975afbe8ab2e85f8ce5d525c17c14769f5723ea97d44938c2707715c860f70861049a864ee1c86cf948045ef2d287d7b7f10d56acb21141cc191fd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mvapich2_2_3_7-gnu-hpc-macros-devel"

inherit rpm
