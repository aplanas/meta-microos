SUMMARY = "PySMB wrapper library"
DESCRIPTION = "easypysmb is a Python library that wraps around the pysmb library."
LICENSE = "GPL-3.0-only"

PV = "1.4.4"

RPM_NAME = "python310-easypysmb-1.4.4-1.13.noarch.rpm"
RPM_HASH = "dcbef997943a85cb63c4d5ee34c318695cc08ccf4f281b702dfd77642cdfd9f55874a1504f5ca100ea635c9e8a6483f691d04ba25369544624c2e5c3a62f166e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-easypysmb \
python310-easypysmb \
python3dist-easypysmb"

RDEPENDS:${PN} += "python-abi \
python310-pysmb"

inherit rpm
