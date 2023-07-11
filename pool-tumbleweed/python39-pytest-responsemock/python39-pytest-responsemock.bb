SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python39-pytest-responsemock-1.1.1-1.7.noarch.rpm"
RPM_HASH = "0d10387ce09f701fc9156f6656f96ceaf6a74e1071b2f301a5ff1eea9a4dd23a15a2dcbfd437114888a8fd41e419c7aed05e6dba4ca8f98c1a5507f29d9e0261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-responsemock \
python39-pytest-responsemock \
python3dist-pytest-responsemock"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-responses"

inherit rpm
