SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-pytest-doctestplus-0.12.1-1.3.noarch.rpm"
RPM_HASH = "cec88a4b4fd6ea447354245e9dcd78a7ea6d15d325f1015eecb1e7d8ecaafeddad879af0ab4e4d65716e1d05130173855be5aa25e6937d64c52083b71853e3b0"
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
