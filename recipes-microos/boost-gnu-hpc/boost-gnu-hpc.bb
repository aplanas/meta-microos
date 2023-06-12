SUMMARY = "Dependency package for boost_1_82_0-gnu-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-hpc provides the dependency to get binary package boost_1_82_0-gnu-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-hpc-1.82.0-1.2.noarch.rpm"
RPM_HASH = "7d6bf0b8a05a9796ccd846922399a9eb94243fd9d4363940f3de8b5adc4a8246251fc9b2569563c1724f7f5a0fddf409c54b5f971e40c5c38ec40b44cfaedd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-hpc"
RDEPENDS:${PN} += "boost_1_82_0-gnu-hpc"

inherit rpm
