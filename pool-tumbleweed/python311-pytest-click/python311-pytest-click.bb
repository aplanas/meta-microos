SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pytest-click-1.1.0-1.8.noarch.rpm"
RPM_HASH = "5ce04b31e883d4c97613468b2429c015496584405761a6f95b28408571199c3e021327702a8a10b8b7fc112b683664b01d5d7b6381f3da5e8405bad401810778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-click \
python3.11dist-pytest-click \
python311-pytest-click \
python3dist-pytest-click"

RDEPENDS:${PN} += "python-abi \
python311-click \
python311-pytest"

inherit rpm
