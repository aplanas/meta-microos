SUMMARY = "Azure Azure Digital Twins Core client library for Python"
DESCRIPTION = "This package contains an SDK for Azure Digital Twins API to provide access to \
the Azure Digital Twins service for managing twins, models, relationships, etc."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-digitaltwins-core-1.2.0-1.5.noarch.rpm"
RPM_HASH = "10eb002a7c487ed067662d8c69bd8c9100fa61f887eade192032826c105c24cb317c41ed01fee6ad780bbf112767abccd8623a078d0d8946be12a2cc2d34fa10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-digitaltwins-core \
python39-azure-digitaltwins-core \
python3dist-azure-digitaltwins-core"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-digitaltwins-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
