SUMMARY = "Azure DocumentDB Python SDK"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Python SDK. \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python311-pydocumentdb-2.3.5-3.11.noarch.rpm"
RPM_HASH = "9432bd65c216e2e7bc65b35ac1a9da0fd0ec5ba7e940eaa2a166d0f6f038574b338564e260fdb67e656032da3d4aba8fa96509de17a3bda25a0b3dbc055e73d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pydocumentdb \
python311-pydocumentdb \
python3dist-pydocumentdb"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm
