SUMMARY = "Dependency package for boost_1_82_0-gnu-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-hpc provides the dependency to get binary package boost_1_82_0-gnu-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-hpc-1.82.0-1.1.noarch.rpm"
RPM_HASH = "8cf84e4354baa7b1543555c7e2416015334ef52209ed894bbe14357b1bf35b60c62e3de5e1baf92b77cc865ef9cf4b877fb6d3a9430f047664d3783915a324f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-hpc"
RDEPENDS:${PN} += "boost_1_82_0-gnu-hpc"

inherit rpm
