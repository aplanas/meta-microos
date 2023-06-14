SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python310-before-after-1.0.1-2.6.noarch.rpm"
RPM_HASH = "37f6cfeb33303647c900a0e6135887dea135689befd83e342d44b019b941fe16b2fa81176f5d47eb7ec1b469b07cb473e3ff48140834240198e8e19f0f8acebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-before-after \
python3.10dist-before-after \
python310-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
