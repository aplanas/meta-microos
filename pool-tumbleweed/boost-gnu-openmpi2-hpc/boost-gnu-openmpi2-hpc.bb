SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi2-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi2-hpc provides the dependency to get binary package boost_1_82_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi2-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi2-hpc-1.82.0-1.1.noarch.rpm"
RPM_HASH = "c616866e076446afe7086dfd18d9bfb3bfb1d5b864131e3944a75f18a399bd638d5b9663bf937f148708d1ca7653a8d80840626e01791feb4562ae9e9aea9db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi2-hpc"

inherit rpm
