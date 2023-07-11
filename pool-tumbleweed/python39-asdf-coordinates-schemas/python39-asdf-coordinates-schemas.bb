SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python39-asdf-coordinates-schemas-0.1.0-1.9.noarch.rpm"
RPM_HASH = "ea36fdabb5181347c05a988192988cce65971a8fec758e7d766f713941b6718910e04c273bb994a3729ee604199d3fdf841cc9907dd7183f7bba0ea883b2326d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf-coordinates-schemas \
python39-asdf-coordinates-schemas \
python3dist-asdf-coordinates-schemas"

RDEPENDS:${PN} += "python-abi \
python39-asdf"

inherit rpm
