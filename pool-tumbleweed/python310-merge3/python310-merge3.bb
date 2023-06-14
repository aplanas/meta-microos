SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.12"

RPM_NAME = "python310-merge3-0.0.12-1.3.noarch.rpm"
RPM_HASH = "f924146389ffc3d5cb4c466b2e30414c56fe86dd6b5a23c276cf943d8909e471f98c71efdb637e2592a57a49dcbb96531241a76633811621662b7ea5fc7d3608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-merge3 \
python3.10dist-merge3 \
python310-merge3 \
python3dist-merge3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
