SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-coveralls-check-1.2.1-3.10.noarch.rpm"
RPM_HASH = "22124b97c0a7ab60f9697748baec2c72d24c45cf5c53655d40899c815494462b526a8162ded79c76a0dbfebc0f62737330f123af147e8e4fa5158c09f4498871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-coveralls-check \
python310-coveralls-check \
python3dist-coveralls-check"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-backoff \
python310-requests \
python310-setuptools \
update-alternatives"

inherit rpm
