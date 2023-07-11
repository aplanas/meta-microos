SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python311-proselint-0.13.0-2.6.noarch.rpm"
RPM_HASH = "193b78e0a230697f4d32302710f922d615bdecab5686db973f80b46351d9840918e22501e15f270e2b1ce6f6f9d0f2e40d60f8b1ac2ea90524b92ba3c7fd4af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proselint \
python3.11dist-proselint \
python311-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-dbm \
python311-future \
update-alternatives"

inherit rpm
