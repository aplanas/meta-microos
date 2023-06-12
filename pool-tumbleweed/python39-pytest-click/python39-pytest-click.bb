SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pytest-click-1.1.0-1.6.noarch.rpm"
RPM_HASH = "ddd9cc1a922e7003f8bcdf6d685be3f30578dc34936db2d92b31c5e16254b31c5c49f2acfa3a29838a998294470234fa1e8b7bbce0da692e3278da9e84248fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-click) \
python39-pytest-click \
python3dist(pytest-click)"
RDEPENDS:${PN} += "python(abi) \
python39-click \
python39-pytest"

inherit rpm
