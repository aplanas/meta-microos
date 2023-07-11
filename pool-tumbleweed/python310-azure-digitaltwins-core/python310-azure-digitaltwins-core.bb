SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-digitaltwins-core-1.2.0-1.5.noarch.rpm"
RPM_HASH = "add9db08f75a780442d0ea77b9a380eba5014f3541ab8862e92f25c7ae639280c66d2c18aa0517678d6da6720cd46daedb2f6056a1e11c7db17f68568f93a873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-digitaltwins-core \
python310-azure-digitaltwins-core \
python3dist-azure-digitaltwins-core"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-digitaltwins-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
