SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python311-pyupgrade-3.4.0-1.1.noarch.rpm"
RPM_HASH = "1dfba51cdf8646604157d40a8ad9eff731133ff52032fafc5cc4fc4c58d2fbb74d7eb96935cf8e57779b5f13e2e176fde24af85ec27f6e97c8a6aa46fabba9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyupgrade \
python311-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-tokenize-rt \
update-alternatives"

inherit rpm
