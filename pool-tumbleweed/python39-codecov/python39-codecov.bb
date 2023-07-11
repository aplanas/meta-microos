SUMMARY = "Hosted coverage reports"
DESCRIPTION = "Hosted coverage reports for Github, Bitbucket and Gitlab."
LICENSE = "Apache-2.0"

PV = "2.1.13"

RPM_NAME = "python39-codecov-2.1.13-1.3.noarch.rpm"
RPM_HASH = "81e5e337189e82660aa31920fa85c1eea9ff116307c255a6124a0594c9ec85bc6943f2fa5270f970330e15ce91702dda79a156cfa5cc8ccaa12680ec3e044c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-codecov \
python39-codecov \
python3dist-codecov"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-coverage \
python39-requests \
update-alternatives"

inherit rpm
