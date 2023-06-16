SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python311-labels-20.1.0-1.4.noarch.rpm"
RPM_HASH = "19c4e6afd5190f808545696d30c95569c2aa064dd484d2e63c25ac439671a3e4a12c1323d6133eeed91cf1f7537aef91a92e5a946de2c0a0b826b20008f77897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-labels \
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
