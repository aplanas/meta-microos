SUMMARY = "Python interface to coveralls io API"
DESCRIPTION = "Python interface to coveralls.io API \
This package provides a module to interface with the https://coveralls.io API."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "python39-python-coveralls-2.9.3-3.11.noarch.rpm"
RPM_HASH = "b99f34f08d49a05bd3447cd85cd35f1da909ef0c917d63c2b10c81cc73e40a1ecf551db5d6cd09b1d69a331568437ec0792ce8fb34389e4c2f059cf7c27cb3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-coveralls \
python39-python-coveralls \
python3dist-python-coveralls"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-coverage \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
