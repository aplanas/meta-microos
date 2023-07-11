SUMMARY = "Dependency package for boost_1_82_0-gnu-hpc"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-hpc provides the dependency to get binary package boost_1_82_0-gnu-hpc. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-hpc-1.82.0-1.4.noarch.rpm"
RPM_HASH = "33361ca61f170fdc8171f1f228deca416bf01829c0c6137c18329ef673ec79f9ea96230b082427be3fe219b537b09b4a51b63c0084f812321a0eb119921db9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-hpc"

RDEPENDS:${PN} += "boost-1-82-0-gnu-hpc"

inherit rpm
