SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python310-cassowary-0.5.2-2.10.noarch.rpm"
RPM_HASH = "7d56b2863bc4307b7ef3b26dd0a5e4db5c424f7db09dace5447290354f76fc1931ab64708f46782678763f5f1ec9554cd39773cb0ace092dc212c4a21562318e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cassowary \
python310-cassowary \
python3dist-cassowary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
