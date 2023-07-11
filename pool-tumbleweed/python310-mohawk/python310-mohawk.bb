SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python310-mohawk-1.1.0-5.5.noarch.rpm"
RPM_HASH = "562142dfe536b07174ef30eeaeba5e644c3c9cf2c38f30aa54923f324c519848403bf63d359161d085167918e185e1838d66854544ce2c5f7a8f853ff5d2f9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mohawk \
python310-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
