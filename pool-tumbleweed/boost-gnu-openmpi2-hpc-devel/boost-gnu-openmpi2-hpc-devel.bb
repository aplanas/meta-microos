SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi2-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi2-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi2-hpc-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "eab3c0b7cd107687aeed98a9cc344bcb6d8e265c530ff88045a2786ecf30a3fb0ba0f486e7fa84f667ad55729c5db1efc8352a848e9822d683b11c752a7a4d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-devel"

inherit rpm
