SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-coveralls-check-1.2.1-3.10.noarch.rpm"
RPM_HASH = "621a9b9c4f232377732148ca208dbb9fecf9f7a6a9e3161014553c0d677115658c9fc8855f71cfca98a2523b7ea103e8e62789c35ee143b2861dcffd60e42027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coveralls-check \
python39-coveralls-check \
python3dist-coveralls-check"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-backoff \
python39-requests \
python39-setuptools \
update-alternatives"

inherit rpm
