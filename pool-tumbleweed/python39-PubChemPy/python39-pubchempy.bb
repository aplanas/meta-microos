SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python39-PubChemPy-1.0.4-1.14.noarch.rpm"
RPM_HASH = "28615f63b35972993399dae17228685ac407e39927b8fea276d474eadaf7e65e71eaf6a6352f226326bf64e66919a6ab76c4f900637e3a4d35797989a961f2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pubchempy \
python39-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
