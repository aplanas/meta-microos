SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python311-PubChemPy-1.0.4-1.14.noarch.rpm"
RPM_HASH = "5bcb52caf2fccac0d3b171b7efd5f691d2806c14abed0c476e63c586896e7f80b39640a5def1224f137967598fb8180840ee4620335671d92490a7d14923ec15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PubChemPy \
python3.11dist-pubchempy \
python311-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
