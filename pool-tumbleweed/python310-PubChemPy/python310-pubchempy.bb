SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-PubChemPy-1.0.4-1.14.noarch.rpm"
RPM_HASH = "13deccb211cb33d552c9c989d5013267653ea59d65063ed1257da54497c7bb1628953c551232ee5b49a26eb8d707dc26ee19c061bda83ba2aceea26d32b85159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pubchempy \
python310-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
