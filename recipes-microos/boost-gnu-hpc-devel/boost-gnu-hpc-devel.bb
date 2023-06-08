SUMMARY = "Dependency package for boost_1_82_0-gnu-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-hpc-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "74e7dd7d66b00bb5324c88d1b6ea84d6e95e44b3bc40190a19f838ea16c223db13a949945c70a1f9379fd3fd930689375f53111a89ad68611a10c0dbcd6a69cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-hpc-devel"
RDEPENDS:${PN} += "boost_1_82_0-gnu-hpc-devel"

inherit rpm
