SUMMARY = "A Python framework for working with the Node.js ecosystem"
DESCRIPTION = "A Python framework for building toolchains and utilities for working \
with the Node.js ecosystem from within a Python environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python311-calmjs-3.4.4-2.1.noarch.rpm"
RPM_HASH = "6d0b92b086839dea0d395617e80075ccf4ac436a4aebb361e05656c3ea55c94448b1c1c3581ccc6e6c8c1324314369131020a0327ac1b35527c34faa7fc28638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs \
python3.11dist-calmjs \
python311-calmjs \
python3dist-calmjs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-calmjs.parse \
python311-calmjs.types \
update-alternatives"

inherit rpm
