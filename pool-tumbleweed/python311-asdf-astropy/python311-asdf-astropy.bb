SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-asdf-astropy-0.4.0-1.3.noarch.rpm"
RPM_HASH = "9ef31f7cde3accbf95957a4f1dcc491fa0e96c76ae193684a58f58e8ed6dc43d4d394ef99ea9358f6832c2cf99333dd2e5b2a40dae0acce5ab16ca51e0c9a142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-astropy \
python3.11dist-asdf-astropy \
python311-asdf-astropy \
python3dist-asdf-astropy"

RDEPENDS:${PN} += "python-abi \
python311-asdf \
python311-asdf-coordinates-schemas \
python311-asdf-transform-schemas \
python311-astropy \
python311-numpy \
python311-packaging"

inherit rpm
