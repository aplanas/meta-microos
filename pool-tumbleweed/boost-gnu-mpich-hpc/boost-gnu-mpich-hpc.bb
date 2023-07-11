SUMMARY = "Dependency package for boost_1_82_0-gnu-mpich-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mpich-hpc provides the dependency to get binary package boost_1_82_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mpich-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mpich-hpc-1.82.0-1.2.noarch.rpm"
RPM_HASH = "ef1a5292fcbe8b575170b6f7bec42ef55e72ea64aa8f2757258f5fd61fd0ea59bc8da1351a37043427bc11aaedab0cd2cd1acd2795b1a26df0a25d53289c370d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mpich-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc"

inherit rpm
