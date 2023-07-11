SUMMARY = "Dependency package for boost_1_82_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mvapich2-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mvapich2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mvapich2-hpc-devel-1.82.0-1.2.noarch.rpm"
RPM_HASH = "ada291527d5f91f1d0bcb116a8de0e51cd8066ac40861076d5f4c79b1f8c95214ab59b9835dcee2a7f5aff30a70831789dc61b16267480d90945ffa4f01113f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-devel"

inherit rpm
