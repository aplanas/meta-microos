SUMMARY = "Python interface to coveralls io API"
DESCRIPTION = "Python interface to coveralls.io API \
This package provides a module to interface with the https://coveralls.io API."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "python310-python-coveralls-2.9.3-3.9.noarch.rpm"
RPM_HASH = "29bbf9f04bc74e13e60b69e087c2525b18fa58747d4e8c6fb98d05be89254e11eeda66cab82c2e93a9f6cf8026a7ca732528df3a2e85915b4541ec7892197bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-coveralls \
python3.10dist-python-coveralls \
python310-python-coveralls \
python3dist-python-coveralls"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-PyYAML \
python310-coverage \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
