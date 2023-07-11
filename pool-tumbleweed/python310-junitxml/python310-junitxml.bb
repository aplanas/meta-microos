SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python310-junitxml-0.7-4.9.noarch.rpm"
RPM_HASH = "644512f436a423631cdd688799ffcbf80c55b24d26b306be7ea14442b29ae0cb8ddefd1a108bd2a25245dc3ddf15090e4dbc2a8b796b02df91ac2edb57e6006e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-junitxml \
python310-junitxml \
python3dist-junitxml"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi"

inherit rpm
