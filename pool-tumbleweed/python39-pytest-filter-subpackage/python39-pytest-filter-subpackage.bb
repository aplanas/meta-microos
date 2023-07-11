SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python39-pytest-filter-subpackage-0.1.2-1.3.noarch.rpm"
RPM_HASH = "0d87267d51d0b7fd9feaf203dad36dc3c08bc5e423da68fab391007fee467db84abc2ae5a74673b899fc0d5720d0e296da1376d3b1d147660acd074d9d760b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-filter-subpackage \
python39-pytest-filter-subpackage \
python3dist-pytest-filter-subpackage"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
