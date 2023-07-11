SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python310-pytest-doctestplus-0.12.1-1.3.noarch.rpm"
RPM_HASH = "0e94fb6bc0f3a98c68dbe6ddc9b8cebbddd6a5a3c0a51df4a8f02b2b00d9f60be0b012eee195b6d2331dca3a2f3abb37287bb947408f6f132097c6a736cfb904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-doctestplus \
python310-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-pytest \
python310-setuptools"

inherit rpm
