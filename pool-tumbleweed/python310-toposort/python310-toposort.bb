SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "python310-toposort-1.7-1.16.noarch.rpm"
RPM_HASH = "d7bc20fae86e8d9ae097c8a45c1494fb4580eb4fce02577e8dff770b5a2a999fe2835c53d39818ce28cedbb8824358d9294e427db9b3b4b2a007d0a2e8bfb870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-toposort \
python310-toposort \
python3dist-toposort"

RDEPENDS:${PN} += "python-abi"

inherit rpm
