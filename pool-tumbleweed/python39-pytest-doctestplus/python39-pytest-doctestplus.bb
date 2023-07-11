SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-pytest-doctestplus-0.12.1-1.3.noarch.rpm"
RPM_HASH = "0ac99cf502418e1d95f4de213f8de690dbec38689222ff2c1320682eeae54c6c35b389ffcce96ae2a64fdffb9ae1f1f731ea85895c00c24468b3f362fe82936a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-doctestplus \
python39-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-pytest \
python39-setuptools"

inherit rpm
