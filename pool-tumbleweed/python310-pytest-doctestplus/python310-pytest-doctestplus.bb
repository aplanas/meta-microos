SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-pytest-doctestplus-0.12.1-1.1.noarch.rpm"
RPM_HASH = "c5437a91b8f29ee114cc499426a58b55b811e257805188ca408d8e59f98235dc53eab83269c27b29141ff1e13c1db0f5e32d5029e3a244fdabfbe689dd5c9292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-doctestplus \
python3.10dist(pytest-doctestplus) \
python310-pytest-doctestplus \
python3dist(pytest-doctestplus)"
RDEPENDS:${PN} += "python(abi) \
python310-packaging \
python310-pytest \
python310-setuptools"

inherit rpm
