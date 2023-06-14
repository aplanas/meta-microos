SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-PubChemPy-1.0.4-1.12.noarch.rpm"
RPM_HASH = "9bd147a74d1da2f869559f070f48efb62e385ff512a248f1531576afc38bbb59de038e893ffc572c401fa15652b1c3019738ccd30e2f5a2d47b214dc5fc84bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pubchempy \
python39-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
