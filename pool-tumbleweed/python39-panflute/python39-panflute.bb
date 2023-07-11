SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python39-panflute-2.3.0-1.2.noarch.rpm"
RPM_HASH = "2a3c99d0c59d3582f6793164969c154ccdd7e78954b4a6c639206365c422e69dde6ef8f3217c4497295af2de99aea433b8f3c32bcc7548478a04ab0ec39c94c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-panflute \
python39-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-click \
python39-future \
update-alternatives"

inherit rpm
