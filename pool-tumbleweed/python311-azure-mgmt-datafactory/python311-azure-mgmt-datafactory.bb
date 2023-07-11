SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-mgmt-datafactory-3.1.0-1.3.noarch.rpm"
RPM_HASH = "5a9a70a5ad1fc829c6a011fcd8dcc1c4292c8aa643cf2dc42a3e0579390fb83f5bd433538796a5bfe5c9ee5944b9dd03f19848d0f01d4b70841166dc760350be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datafactory \
python3.11dist-azure-mgmt-datafactory \
python311-azure-mgmt-datafactory \
python3dist-azure-mgmt-datafactory"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
