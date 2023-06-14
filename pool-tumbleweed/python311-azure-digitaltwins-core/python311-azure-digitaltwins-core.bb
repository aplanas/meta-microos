SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-digitaltwins-core-1.2.0-1.3.noarch.rpm"
RPM_HASH = "ef11ec04a856106249a746b2a3f7ac6e33e71c03ca5a3651d6c3b891618ade3410a4ea25751927d9d8055395b3609aafd3485047ae2cebfe2e7e26a7992d1352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-digitaltwins-core \
python311-azure-digitaltwins-core \
python3dist-azure-digitaltwins-core"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-digitaltwins-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
