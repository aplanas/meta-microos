SUMMARY = "Dependency package for boost_1_82_0-gnu-mvapich2-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mvapich2-hpc provides the dependency to get binary package boost_1_82_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mvapich2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mvapich2-hpc-1.82.0-1.1.noarch.rpm"
RPM_HASH = "14db5096a3a5dc99f0507c75a96b727eff9387eae8b587aa8d3190626c68e540d03f50e196ab4eb47d56bcf1a4ca9e44faa40d3011a27b7c455dddb056f44161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mvapich2-hpc"
RDEPENDS:${PN} += "boost_1_82_0-gnu-mvapich2-hpc"

inherit rpm
