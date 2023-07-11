SUMMARY = "Python interface to coveralls io API"
DESCRIPTION = "Python interface to coveralls.io API \
This package provides a module to interface with the https://coveralls.io API."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "python311-python-coveralls-2.9.3-3.11.noarch.rpm"
RPM_HASH = "07c91fe6270dfb3ab4a790915df26be62191ebbec20056ab17b03d2c3551af5c6bd0383ae77a2e0651ece63d2208ad95fffae641450292a171153fab34ed02c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-coveralls \
python3.11dist-python-coveralls \
python311-python-coveralls \
python3dist-python-coveralls"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-coverage \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
