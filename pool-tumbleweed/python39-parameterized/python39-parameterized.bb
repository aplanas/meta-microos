SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python39-parameterized-0.9.0-2.1.noarch.rpm"
RPM_HASH = "f4268a62c21ac82b4e60228b2cc8c984e065bf28e4e3675ee5f2710a7e2ec24fecc69a89fa1b1f926bfc7164e3fab7bd101f804eeec122da59d6563b4925cc45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parameterized \
python39-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
