SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python310-labels-20.1.0-1.6.noarch.rpm"
RPM_HASH = "83a6d1f5860610a96c4df30135e3006c4c0fd8894d67648d1d973624d0c127e8f437a0bb4aadef3a700dbd0690ad12be19c31fb2894f3a107964f41934410034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-labels \
python310-labels \
python3dist-labels"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-click \
python310-pytoml \
python310-requests \
update-alternatives"

inherit rpm
