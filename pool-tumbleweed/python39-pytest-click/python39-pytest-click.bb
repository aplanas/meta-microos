SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pytest-click-1.1.0-1.8.noarch.rpm"
RPM_HASH = "bafa9ad7679084bffd9c287e86e6b5cb671c4c73542c4d65154bca12b0b4186f64f1fff51075d56bf86c6e83f3e7c8b0cc5880b92c82b9bbef74a2a3796b7ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-click \
python39-pytest-click \
python3dist-pytest-click"

RDEPENDS:${PN} += "python-abi \
python39-click \
python39-pytest"

inherit rpm
