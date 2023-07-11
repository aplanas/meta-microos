SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-mgmt-kusto-3.1.0-1.3.noarch.rpm"
RPM_HASH = "cfcc7dc4f04320ae1f4071a3df796e801afd1b8811a6f19a37765317c74ba33a46d48e11e65011226ef5b7baa2614cf93d137406490d949d5042e0156453c0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-kusto \
python310-azure-mgmt-kusto \
python3dist-azure-mgmt-kusto"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
