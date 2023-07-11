SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python39-python-akismet-0.4.3-1.5.noarch.rpm"
RPM_HASH = "7b652ced3d16c17556558f767d1575c2ffc83707dd362147d518b50e662f709f15be2d5419d01a7fb94213570715ee8dc7cbe7b0dcbdbad00d2a1f16b0fba1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-akismet \
python39-python-akismet \
python3dist-python-akismet"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
