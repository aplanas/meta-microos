SUMMARY = "Dependency package for boost_1_82_0-gnu-mpich-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-mpich-hpc provides the dependency to get binary package boost_1_82_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-mpich-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-mpich-hpc-1.82.0-1.1.noarch.rpm"
RPM_HASH = "65013768991b4ba7b01bb394692a5623e65a7743e26f4a4ae482d2ae829f223499d2e05d3b48eda7cbf86169a356547d8c308a6fc05afb533fd68acdd6075a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-mpich-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc"

inherit rpm
