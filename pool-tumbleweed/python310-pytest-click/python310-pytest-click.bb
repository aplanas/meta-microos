SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-pytest-click-1.1.0-1.8.noarch.rpm"
RPM_HASH = "08cf2c89ffed3cc5539b74d6a5b338e3829d13d3764163b475e36b8bc93aff158c8515d87bcdb40ba28515212f0d39b135644dab34325386dc9e09902aebdf66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-click \
python310-pytest-click \
python3dist-pytest-click"

RDEPENDS:${PN} += "python-abi \
python310-click \
python310-pytest"

inherit rpm
