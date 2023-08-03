SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python310-pytest-doctestplus-0.13.0-1.1.noarch.rpm"
RPM_HASH = "4d3668b37bcb7d921e789ee84c57cf78f129e155e7093dd2a9c6b0017ecb71da70af49634ecbdb953374929126116040c8fdceafe7796bd65fb2fc7759479179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-doctestplus \
python310-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-pytest \
python310-setuptools"

inherit rpm
