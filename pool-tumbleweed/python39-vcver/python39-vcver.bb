SUMMARY = "Provide package versions with version control data"
DESCRIPTION = "Python module to provide package versions with version control data."
LICENSE = "MIT"

PV = "0.2.12"

RPM_NAME = "python39-vcver-0.2.12-1.5.noarch.rpm"
RPM_HASH = "26a9ebe57e29f68551b305fbab07d3bf8ac64c401ddaf6ca0d453eb393186fcd7acb85c93bf9fc7f33cbd286456fd4326ce55e63e6eea53474c2627503676c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vcver \
python39-vcver \
python3dist-vcver"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm
