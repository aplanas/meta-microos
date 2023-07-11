SUMMARY = "Python interface to coveralls io API"
DESCRIPTION = "Python interface to coveralls.io API \
This package provides a module to interface with the https://coveralls.io API."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "python310-python-coveralls-2.9.3-3.11.noarch.rpm"
RPM_HASH = "4eaef50da8591dfcd3f91cf1ead15c174a08070f2921fb0561e78b7b19b4c9ba2e762906a2e89ec46210b6bcc885c440dd22b6b3347d282151b63db59b72e19a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-coveralls \
python310-python-coveralls \
python3dist-python-coveralls"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-coverage \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
