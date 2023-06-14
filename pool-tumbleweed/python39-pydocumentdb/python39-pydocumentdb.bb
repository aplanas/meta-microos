SUMMARY = "Azure DocumentDB Python SDK"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Python SDK. \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python39-pydocumentdb-2.3.5-3.11.noarch.rpm"
RPM_HASH = "b0218836871a407bfbefef7ab23d45e10d530df30ac47d80a4da21cfb86ec62cf1cf777feaca8173c4da62b5d6e39238da78a3334e831a0734e548b8dfb357ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydocumentdb \
python39-pydocumentdb \
python3dist-pydocumentdb"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
