SUMMARY = "Azure DocumentDB Python SDK"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Python SDK. \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python39-pydocumentdb-2.3.5-3.13.noarch.rpm"
RPM_HASH = "a03c2963a24a2fc4f7e7a2e0043c2ed9e58bdef0180682797834e0b507272b5f704a4eda603d1ed3ececb52a0cbdacb1daed59a67a804fab8ce422da64bdd250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydocumentdb \
python39-pydocumentdb \
python3dist-pydocumentdb"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
