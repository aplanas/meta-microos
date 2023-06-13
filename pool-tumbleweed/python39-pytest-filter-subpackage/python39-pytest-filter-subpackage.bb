SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python39-pytest-filter-subpackage-0.1.2-1.1.noarch.rpm"
RPM_HASH = "554f964e15f44bb129f09c67982b2e97fb363172424ce0a49a083fa3a85bcd741d412a6f8c5195950bde7006a82ff97bc471306b27bb747776489b007ada5d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-filter-subpackage) \
python39-pytest-filter-subpackage \
python3dist(pytest-filter-subpackage)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
