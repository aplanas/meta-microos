SUMMARY = "Microsoft Azure Relay Client Library"
DESCRIPTION = "This is the Microsoft Azure Relay Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-relay-1.1.0-1.9.noarch.rpm"
RPM_HASH = "60a4804547c9a7a34102b73ffdbefdeaa2902ac7f937e743a567b177aab75db4b360e5b3c27bedb3795b03c0c18b4e501b9fe56a6e4f263cf02ce73d2b9dd003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-relay \
python310-azure-mgmt-relay \
python3dist-azure-mgmt-relay"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
