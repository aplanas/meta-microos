SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-requirements-detector-0.7-2.13.noarch.rpm"
RPM_HASH = "efddbf44a21761d7e97cdcd05f4ac283ff8221621b8a542a9bc98ca351e0fa664dae59c2a753518155dd8baf0d6aab8b8a6d7018527e652d1d8dc5c853d9429c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requirements-detector \
python39-requirements-detector \
python3dist-requirements-detector"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astroid \
update-alternatives"

inherit rpm
