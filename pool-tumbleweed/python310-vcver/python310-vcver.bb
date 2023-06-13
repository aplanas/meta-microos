SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python310-vcver-0.2.12-1.3.noarch.rpm"
RPM_HASH = "685c2af3d70eba434cc788aa10328b09ae57f1821a945fddcb0645380c6b850e3e03d6ec54ee3cc609215cd1bb0b35b9331bc65e20115d4eab221930ec042e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcver \
python3.10dist(vcver) \
python310-vcver \
python3dist(vcver)"

RDEPENDS:${PN} += "python(abi) \
python310-packaging"

inherit rpm
