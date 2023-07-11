SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.7"

RPM_NAME = "python39-toposort-1.7-1.16.noarch.rpm"
RPM_HASH = "e90ccd24daa9fee978a77374975273a0237964da0befa0d4b47c89ffa409a33da09b1e55d09f66da54a80b01fcacd102a5d290f1f9f518af1f85396df3212940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-toposort \
python39-toposort \
python3dist-toposort"

RDEPENDS:${PN} += "python-abi"

inherit rpm
