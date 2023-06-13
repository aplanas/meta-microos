SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python310-pytest-filter-subpackage-0.1.2-1.1.noarch.rpm"
RPM_HASH = "987bf2274e83eea9b08b9c20cecc25240e7a7cc54a44dfc22f7f12150278a73cf725e2251d57a9631d697781a4a0bdfe55c555a6fc20d97d79123eb874ebeaab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-filter-subpackage \
python3.10dist(pytest-filter-subpackage) \
python310-pytest-filter-subpackage \
python3dist(pytest-filter-subpackage)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
