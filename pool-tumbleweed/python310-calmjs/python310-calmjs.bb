SUMMARY = "A Python framework for working with the Node.js ecosystem"
DESCRIPTION = "A Python framework for building toolchains and utilities for working \
with the Node.js ecosystem from within a Python environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python310-calmjs-3.4.4-1.1.noarch.rpm"
RPM_HASH = "3467b779fc73e0f3590fc3891f816b3ba2a3e9fbfe277150ff2ef1540ebaf635ce2cd95def07089077a7122a59418fd76c15d95398bd872a3da214a218e95164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs \
python3.10dist-calmjs \
python310-calmjs \
python3dist-calmjs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-calmjs.parse \
python310-calmjs.types \
update-alternatives"

inherit rpm
