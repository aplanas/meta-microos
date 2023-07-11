SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-pytest-isort-3.1.0-1.5.noarch.rpm"
RPM_HASH = "e0d24333b07c5e7258621718edaf77250057c0b6dea78aeb3c71851a408a8707059f5ea73f3a864da27ddfd7da63584e4da49711e87c6f195680bd2b603c1192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-isort \
python310-pytest-isort \
python3dist-pytest-isort"

RDEPENDS:${PN} += "python-abi \
python310-isort \
python310-pytest"

inherit rpm
