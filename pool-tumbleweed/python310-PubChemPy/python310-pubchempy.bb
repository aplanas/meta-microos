SUMMARY = "A simple Python wrapper around the PubChem PUG REST API"
DESCRIPTION = "PubChemPy provides a way to interact with PubChem in Python. It allows chemical \
searches by name, substructure and similarity, chemical standardization, \
conversion between chemical file formats, depiction and retrieval of chemical \
properties."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-PubChemPy-1.0.4-1.12.noarch.rpm"
RPM_HASH = "abf9f03bed100e94d09eb0ab78c0dc3832849efddde23dae1fb49787df2fc5af784800f88c55fd92fb8011ed6b38bef6f8d6144a196ccb86113afef96ef81aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PubChemPy \
python3.10dist-pubchempy \
python310-PubChemPy \
python3dist-pubchempy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
