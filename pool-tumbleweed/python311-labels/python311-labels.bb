SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python311-labels-20.1.0-1.6.noarch.rpm"
RPM_HASH = "d1853e3bd9935f096a24aaa1a2b12711539f289e8220937de246fbb2e4cb13bfde03dc8b91723eabb17c9648418702320c206cc8e96384dc7231cad8781bf6a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-labels \
python3.11dist-labels \
python311-labels \
python3dist-labels"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-click \
python311-pytoml \
python311-requests \
update-alternatives"

inherit rpm
