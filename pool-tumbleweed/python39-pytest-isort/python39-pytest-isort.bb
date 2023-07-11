SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-pytest-isort-3.1.0-1.5.noarch.rpm"
RPM_HASH = "89c69c9704da24dd21d474586488e807f380fc82742d263dea3f503e8d5a16b11ef0717fab6615936f27a44bc3c097df5d999be4ff1a985d9baa5373e95ddd0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-isort \
python39-pytest-isort \
python3dist-pytest-isort"

RDEPENDS:${PN} += "python-abi \
python39-isort \
python39-pytest"

inherit rpm
