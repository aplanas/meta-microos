SUMMARY = "Dependency package for boost_1_82_0-gnu-mpich-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mpich-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-mpich-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mpich-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mpich-hpc-python3-1.82.0-1.2.noarch.rpm"
RPM_HASH = "b2d8c69e3f97384931e07d42f05338888a457e4943a1224ff18db80927e217f025383cfc88279e1322d9f5d7557cb4b6333f831a7b68a281cc9fcee2a39aab05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mpich-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc-python3"

inherit rpm
