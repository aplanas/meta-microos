SUMMARY = "A Python framework for working with the Node.js ecosystem"
DESCRIPTION = "A Python framework for building toolchains and utilities for working \
with the Node.js ecosystem from within a Python environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.4"

RPM_NAME = "python39-calmjs-3.4.4-2.1.noarch.rpm"
RPM_HASH = "4f2f13475fe54c08a5b10eee886e3b78c8e3c113cffa41be3158d54d200f8e377d756b2f18cc346e19e9f8c9521e757c8905c0674084842a05d68f9583d8795e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-calmjs \
python39-calmjs \
python3dist-calmjs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-calmjs.parse \
python39-calmjs.types \
update-alternatives"

inherit rpm
