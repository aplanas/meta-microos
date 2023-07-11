SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python39-labels-20.1.0-1.6.noarch.rpm"
RPM_HASH = "ea2e6553df873fef8879bd3d9b4717bbe6d0790d2420a164b8454e11afc954526760d5f3e88d43135205ee3cd64185a67fe44379cef78b2926df0cf2f57f0c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-labels \
python39-labels \
python3dist-labels"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-click \
python39-pytoml \
python39-requests \
update-alternatives"

inherit rpm
