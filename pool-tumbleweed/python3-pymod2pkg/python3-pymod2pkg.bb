SUMMARY = "OpenStack Packaging - python module name to package name map"
DESCRIPTION = "pymod2pkg is a simple python module for translating python module names to \
corresponding package names which is a common problem in the packaging world. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python3-pymod2pkg-0.26.0-2.1.noarch.rpm"
RPM_HASH = "d36c5d6177dfd6b8022918edafa61d10f2dc00cb612e796f0d1e856238f27aeee38d5851a3b85be3ad1863c73cda79977f1eca5fa901127142107e4aa638d8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymod2pkg \
python3.11dist-pymod2pkg \
python3dist-pymod2pkg"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-distro \
python3-pbr"

inherit rpm
