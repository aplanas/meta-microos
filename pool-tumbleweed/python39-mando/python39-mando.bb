SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-mando-0.7.1-2.3.noarch.rpm"
RPM_HASH = "b544c62592a247a55665af9e404de430d1522303fb39d0b7c36638619f06fc9ca877551e4c4b7a602da1624db0d4049d3ea6146a44a5c1112ea27241d6355183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mando \
python39-mando \
python3dist-mando"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
