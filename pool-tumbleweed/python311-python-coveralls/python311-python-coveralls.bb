SUMMARY = "Python interface to coveralls io API"
DESCRIPTION = "Python interface to coveralls.io API \
This package provides a module to interface with the https://coveralls.io API."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "python311-python-coveralls-2.9.3-3.9.noarch.rpm"
RPM_HASH = "936b6e65c2f7583aa2cd02c631c116ea617e2778c9b2410e89c47ff6f11f5aeb31606dbf396d9c98d4c6856b32ab312db6055f5f7688a4010bdc9b8f4e4949f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-coveralls \
python311-python-coveralls \
python3dist-python-coveralls"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-coverage \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
