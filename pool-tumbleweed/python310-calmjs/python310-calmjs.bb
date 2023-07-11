SUMMARY = "A Python framework for working with the Node.js ecosystem"
DESCRIPTION = "A Python framework for building toolchains and utilities for working \
with the Node.js ecosystem from within a Python environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python310-calmjs-3.4.4-2.1.noarch.rpm"
RPM_HASH = "4a0f73bbd015633e06f2302ca6cb62594a0cf4393b776b22f510a4a008e98364191d19c9ea3d5115a06ce7f35238470f56a2a029a3a576631cabeb287f72373c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-calmjs \
python310-calmjs \
python3dist-calmjs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-calmjs.parse \
python310-calmjs.types \
update-alternatives"

inherit rpm
