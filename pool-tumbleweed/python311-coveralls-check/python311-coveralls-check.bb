SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-coveralls-check-1.2.1-3.10.noarch.rpm"
RPM_HASH = "b197dbbfef075f64a938e0ce9c978018466b5ea11d7e7decc910447e6081020b2f65791fb807c1e6d3492a757d79b095f9163af9269413831f84853d2ce35f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coveralls-check \
python3.11dist-coveralls-check \
python311-coveralls-check \
python3dist-coveralls-check"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-backoff \
python311-requests \
python311-setuptools \
update-alternatives"

inherit rpm
