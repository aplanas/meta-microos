SUMMARY = "Dependency package for boost_1_82_0-gnu-openmpi3-hpc-python3"
DESCRIPTION = "boost: Boost C++ Libraries \
The package boost-gnu-openmpi3-hpc-python3 provides the dependency to get binary package boost_1_82_0-gnu-openmpi3-hpc-python3. \
When this package gets updated it installs the latest version of boost_1_82_0-gnu-openmpi3-hpc."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost-gnu-openmpi3-hpc-python3-1.82.0-1.1.noarch.rpm"
RPM_HASH = "9149d360f7d98d1ec299a6a7fd6170c75086f433ad1df19266e40deb578d57d96d7c8ee23ace864e34f7472866c691c35f39afe60e2dcdaee8d618917881d72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boost-gnu-openmpi3-hpc-python3"
RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi3-hpc-python3"

inherit rpm
