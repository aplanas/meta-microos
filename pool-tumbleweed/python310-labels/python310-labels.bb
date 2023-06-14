SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python310-labels-20.1.0-1.4.noarch.rpm"
RPM_HASH = "ee5bbf165435c374b934d31d87ffee476546375d5323989f09cce6c84e7c016dd3b3821617b1d3703e19f74730ba870bbe832e6171e88d0df2c0c56b34c6b159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-labels \
python3.10dist-labels \
python310-labels \
python3dist-labels"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-attrs \
python310-click \
python310-pytoml \
python310-requests \
update-alternatives"

inherit rpm
