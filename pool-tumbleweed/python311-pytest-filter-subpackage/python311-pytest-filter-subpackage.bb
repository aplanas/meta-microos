SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python311-pytest-filter-subpackage-0.1.2-1.1.noarch.rpm"
RPM_HASH = "5bde5758c32f93a9b49aeb0390f755d30931c6eca227ce25d0b82468ee06ac44edd529affc5e96666ea0d350d6dc300e38d803ff6fb25d4c3de522e9053ee644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-filter-subpackage) \
python311-pytest-filter-subpackage \
python3dist(pytest-filter-subpackage)"

RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
