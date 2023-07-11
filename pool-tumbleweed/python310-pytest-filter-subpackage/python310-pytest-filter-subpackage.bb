SUMMARY = "Pytest plugin for filtering based on sub-packages"
DESCRIPTION = "This package contains a simple plugin for the pytest framework that provides a \
shortcut to testing all code and documentation for a given sub-package."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python310-pytest-filter-subpackage-0.1.2-1.3.noarch.rpm"
RPM_HASH = "cba1559987a256321f9099fbc0ebaae54529fac4f6398f14f53b57d2d200969e8f264ec2f24adbca2d05b56773cb1b0b16ffb1b540a4254ff4f198f73080f095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-filter-subpackage \
python310-pytest-filter-subpackage \
python3dist-pytest-filter-subpackage"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
