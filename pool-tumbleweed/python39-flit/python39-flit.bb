SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-flit-3.8.0-5.3.noarch.rpm"
RPM_HASH = "5c450dfaae1b43bdfe2d977c8b057777b7170a3ded1efc6bb40b889f059558a1fbc89c597f0de561cd243be8f6a9c5ee358a775110b8017e42d8fe88ec132e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flit \
python39-flit \
python3dist-flit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
python39-flit-core \
python39-requests \
python39-tomli-w \
update-alternatives"

inherit rpm
