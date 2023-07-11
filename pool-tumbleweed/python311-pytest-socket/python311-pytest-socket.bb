SUMMARY = "Pytest Plugin to disable socket"
DESCRIPTION = "A Pytest Plugin to disable socket calls during tests."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-pytest-socket-0.6.0-1.3.noarch.rpm"
RPM_HASH = "bb1b591bbf15dc1b9b2f57982a1071f24482207cc57e503df849b2a79fddd58ab8df8ad3e059e0db0525df5be65245558863041a5a7bb9a9373380e90454c06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-socket \
python3.11dist-pytest-socket \
python311-pytest-socket \
python3dist-pytest-socket"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
