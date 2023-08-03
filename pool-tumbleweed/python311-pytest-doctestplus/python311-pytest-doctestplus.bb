SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python311-pytest-doctestplus-0.13.0-1.1.noarch.rpm"
RPM_HASH = "b4fc944f102a8b20c72bfe56355e376dbffd747799fd9a6eb8d0f4490b89b28250ea0d19a88a8190809b28d55f2136af74cb265f9b23ad553a5d0f88a1d0fd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-doctestplus \
python3.11dist-pytest-doctestplus \
python311-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-pytest \
python311-setuptools"

inherit rpm
