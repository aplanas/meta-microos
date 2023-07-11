SUMMARY = "Azure DocumentDB Python SDK"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Python SDK. \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python311-pydocumentdb-2.3.5-3.13.noarch.rpm"
RPM_HASH = "7b5dbd1236502d572cabff6d7fa7cdc121db1bd2c4d106a0f70713beeda9316035569a8e820af93f2d19280bb244f9f2586ef97a88d528e3eeb8e25333799298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydocumentdb \
python3.11dist-pydocumentdb \
python311-pydocumentdb \
python3dist-pydocumentdb"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm
