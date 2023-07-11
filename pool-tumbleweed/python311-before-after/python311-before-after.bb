SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python311-before-after-1.0.1-3.1.noarch.rpm"
RPM_HASH = "8e559999e18198373ddb6f3b89ae854303069efc93b0e1964bb9662fd7890f88696dd6805317c15fad6d5cc2ebe5784a889b4a7a957675ba593b5f4d1a7b6758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-before-after \
python3.11dist-before-after \
python311-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
