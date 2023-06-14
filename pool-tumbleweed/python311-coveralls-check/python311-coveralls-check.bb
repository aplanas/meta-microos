SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-coveralls-check-1.2.1-3.8.noarch.rpm"
RPM_HASH = "4eeef5a806c1cb9c99edd3ff948eba2d17b5da8ce99294fac2d4859b40421b00119cfd1e81ebfeedabf9b32645a4a6c19b427aa25bd213f7b97874bdc1cfa411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-coveralls-check \
python311-coveralls-check \
python3dist-coveralls-check"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-backoff \
python311-requests \
python311-setuptools \
update-alternatives"

inherit rpm
