SUMMARY = "Microsoft Azure Kusto Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kusto Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-mgmt-kusto-3.1.0-1.3.noarch.rpm"
RPM_HASH = "b99753289f05fac8c7bf8af92cc61fed494ae3418e75ad13e69177d67ca21d5ea75f896c5a53ad4259313e940be0ce43603362f0d82973e50a2c7f6823a567eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kusto \
python3.11dist-azure-mgmt-kusto \
python311-azure-mgmt-kusto \
python3dist-azure-mgmt-kusto"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
