SUMMARY = "Azure DocumentDB Python SDK"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Python SDK. \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python310-pydocumentdb-2.3.5-3.13.noarch.rpm"
RPM_HASH = "c42637d800881a489cb630cc352a5f507a59e6e8f9837f0509f7e8d6d8e87ace073104c7ad0e09a0ac4bc646ada18df919890d932c8e8b74d9990dbc388413ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydocumentdb \
python310-pydocumentdb \
python3dist-pydocumentdb"

RDEPENDS:${PN} += "python-abi \
python310-requests \
python310-six"

inherit rpm
