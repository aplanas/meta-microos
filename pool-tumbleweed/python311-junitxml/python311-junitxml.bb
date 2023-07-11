SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python311-junitxml-0.7-4.9.noarch.rpm"
RPM_HASH = "b8cfaf69edac1af7058218776fa916892fc60fadea03177d58f56795d48793437071c832a595fee5cdd30f0b7dd0c0391e5e3bbdfc73d30b2b03c9f1bc015403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junitxml \
python3.11dist-junitxml \
python311-junitxml \
python3dist-junitxml"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
