SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python39-requirements-detector-0.7-2.11.noarch.rpm"
RPM_HASH = "ecc9d2040019d4a94c2a0d57a1ff82d72f13abb5f06e25d089ca819dfaf7ed2894b78a2f92a2451e2b9b35c8e2bf397b5b5fb03a178cd53cda1946e97cf362ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requirements-detector) \
python39-requirements-detector \
python3dist(requirements-detector)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-astroid \
update-alternatives"

inherit rpm
