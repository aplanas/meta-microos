SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-digitaltwins-core-1.2.0-1.5.noarch.rpm"
RPM_HASH = "d1287e42aaa9f55d88b8abd3698253b450da5471fd878551a7b1b24c7f1f5150384a8fd9c0cefd6f909f92f9ae40cc10a12b671578dc8f5fc99508d9de65f1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-digitaltwins-core \
python3.11dist-azure-digitaltwins-core \
python311-azure-digitaltwins-core \
python3dist-azure-digitaltwins-core"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-digitaltwins-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
