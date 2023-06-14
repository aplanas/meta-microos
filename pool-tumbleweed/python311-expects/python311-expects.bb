SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python311-expects-0.9.0-1.16.noarch.rpm"
RPM_HASH = "1cbb5514168237d26034912e1c6cc0125b6818b27a645498a1b645f035e27d746b56550a2f1d8bf70e749fec2d95660208aa5daf767174acecb8e02afbf7b018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-expects \
python311-expects \
python3dist-expects"

RDEPENDS:${PN} += "python-abi"

inherit rpm
