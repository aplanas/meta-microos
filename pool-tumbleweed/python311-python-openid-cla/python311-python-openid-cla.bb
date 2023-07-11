SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python311-python-openid-cla-1.2-1.19.noarch.rpm"
RPM_HASH = "acda0ffb03f9ed253b58925bcce2db9ca7887a68ed8952462e8b69a5cedd83c7609999b9e4d5fc3e130b692169036638a0d0d24ed8b7cb787b7e503c3abacdc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-openid-cla \
python3.11dist-python-openid-cla \
python311-python-openid-cla \
python3dist-python-openid-cla"

RDEPENDS:${PN} += "python-abi"

inherit rpm
