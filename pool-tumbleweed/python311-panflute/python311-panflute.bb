SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-panflute-2.3.0-1.1.noarch.rpm"
RPM_HASH = "b47fe5a9823261e7694a2fef5c193114bb2475f054799c3e5ee9795ca3b17c6d5ac6d7ce78c6555235c304fd3aa822a43d47415cab3feb82afde11a55742ed5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-panflute \
python311-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
python311-future \
update-alternatives"

inherit rpm
