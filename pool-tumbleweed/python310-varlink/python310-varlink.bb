SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python310-varlink-31.0.0-1.6.noarch.rpm"
RPM_HASH = "f7cca9dd944db9acba106a0fbeabaed0e6879391d75ecafb4be6f69fffffd4c9ff2fd75a8ffc6e218b818d770c61667f98532c5e7810a39fa2e5b66c684a4d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varlink \
python3.10dist(varlink) \
python310-varlink \
python3dist(varlink)"

RDEPENDS:${PN} += "/usr/bin/env \
python(abi) \
python310-future"

inherit rpm
