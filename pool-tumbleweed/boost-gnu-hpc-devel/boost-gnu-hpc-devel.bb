SUMMARY = "Dependency package for boost_1_82_0-gnu-hpc-devel"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-hpc-devel provides the dependency to get binary package boost_1_82_0-gnu-hpc-devel. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-hpc-devel-1.82.0-1.4.noarch.rpm"
RPM_HASH = "4c696cab30f2b80219b629e90d78db49cd845fc5ba8da13869594f342a39413a1fe730286def3607d23898e575f59073b6560b60916205b27d540ab1bc7b2fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-hpc-devel"

inherit rpm
