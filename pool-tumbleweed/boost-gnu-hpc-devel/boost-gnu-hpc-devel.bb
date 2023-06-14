SUMMARY = "Dependency package for boost_1_82_0-gnu-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-hpc-devel-1.82.0-1.2.noarch.rpm"
RPM_HASH = "1d39e81d30214d6c6103fb0c33cc11c1dd2d01e3618030788a0a71ba1748e98e790d50f428c8eb6e078828021ca2742348bc03c6f667c9420e600e6943eeccb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-hpc-devel"

inherit rpm
