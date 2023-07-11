SUMMARY = "Pytest plugin to check import ordering using isort"
DESCRIPTION = "This is a pytest plugin to check import ordering using isort."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-pytest-isort-3.1.0-1.5.noarch.rpm"
RPM_HASH = "c92ba13b9e4fa77405f170140ea41100d7dadc7cbe2d1c41a48c1fca24f37677c5be3dd60b6c94f350140f72585ce4503a991985c004bffac775c5c2627655ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-isort \
python3.11dist-pytest-isort \
python311-pytest-isort \
python3dist-pytest-isort"

RDEPENDS:${PN} += "python-abi \
python311-isort \
python311-pytest"

inherit rpm
