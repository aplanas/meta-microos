SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python39-before-after-1.0.1-3.1.noarch.rpm"
RPM_HASH = "abcc8e1ee48d78f11e30820ec7642384aefd73f55e93ffdcab7f86f6206c1724bfc8ea685728709bc917725de368c1a5db5774e06c2f91a3e8b527e89efd7772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-before-after \
python39-before-after \
python3dist-before-after"

RDEPENDS:${PN} += "python-abi"

inherit rpm
