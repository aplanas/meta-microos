SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python311-pytest-filter-subpackage-0.1.2-1.3.noarch.rpm"
RPM_HASH = "584bc762cc10bfb61dbe0ab7c49fc2e158ab90dab69ee0597c561d6cb3b751638ecdcb18b7f1522fe100aa9f2a99a65f9e3fb28a49f0efbfddd4cb2f453c1cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-filter-subpackage \
python3.11dist-pytest-filter-subpackage \
python311-pytest-filter-subpackage \
python3dist-pytest-filter-subpackage"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
