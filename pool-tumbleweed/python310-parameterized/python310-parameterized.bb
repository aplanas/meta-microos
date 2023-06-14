SUMMARY = "Parameterized testing"
DESCRIPTION = "Parameterized testing with any Python test framework."
LICENSE = "BSD-2-Clause"

PV = "0.9.0"

RPM_NAME = "python310-parameterized-0.9.0-1.1.noarch.rpm"
RPM_HASH = "937523f0d707757c147a2396cd6e1839ab8520c43953d581815049a823e5facd9f4c59ac02d841c7aef6b2ea250506df6ca6cbcaa921aac40148d485b1eb1a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parameterized \
python3.10dist-parameterized \
python310-parameterized \
python3dist-parameterized"

RDEPENDS:${PN} += "python-abi"

inherit rpm
