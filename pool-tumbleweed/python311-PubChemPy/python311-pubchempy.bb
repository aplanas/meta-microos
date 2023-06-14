SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-PubChemPy-1.0.4-1.12.noarch.rpm"
RPM_HASH = "a67d3cb6ebbf8c2373c38a8b6468b78739386ad23bcea0b86908c3432a2e759095321a5d9284f624ef170f85995bd818dd179fcd091d75543926b22bfc961d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pubchempy \
python311-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
