SUMMARY = "Dependency package for mvapich2_2_3_7-gnu-hpc-doc"
DESCRIPTION = "mvapich2: OSU MVAPICH2 MPI package \
The package mvapich2-gnu-hpc-doc provides the dependency to get binary package mvapich2_2_3_7-gnu-hpc-doc. \
When this package gets updated it installs the latest version of mvapich2_2_3_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.3.7"

RPM_NAME = "mvapich2-gnu-hpc-doc-2.3.7-4.3.noarch.rpm"
RPM_HASH = "3a3b0b2b19511daba80528285350395d4b65de65e4b7a27bfa11e6a17d137c1eabc038b206486eb6bc5d7b30a60ef90b6e2da6ac367156c3b057ee3ea4f8c811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvapich2-gnu-hpc-doc"

RDEPENDS:${PN} += "mvapich2-2-3-7-gnu-hpc-doc"

inherit rpm
