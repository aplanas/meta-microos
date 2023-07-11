SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python310-parameterized-0.9.0-1.3.noarch.rpm"
RPM_HASH = "68dc2aa76f499a8c2f4cf163f1fce17531d58161b6b915874b191423796b6d2e686da3b6075a5145129d4f9eb1b35b5cdc48f66aeed70523eb6de26524d1be61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parameterized \
python310-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
