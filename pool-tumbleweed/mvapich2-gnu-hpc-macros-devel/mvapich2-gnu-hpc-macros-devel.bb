SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-macros-devel"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-macros-devel provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-macros-devel. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-macros-devel-2.3.7-4.4.noarch.rpm"
RPM_HASH = "6aa189a5b6dff78e75a8d3422801ef08024e29846b0e614baa923f9dcaef1f7097c12d1878c22cfbc5962e38272a7d65b9327ddc2f05d7594f1950df34442bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-macros-devel"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-macros-devel"

inherit rpm
