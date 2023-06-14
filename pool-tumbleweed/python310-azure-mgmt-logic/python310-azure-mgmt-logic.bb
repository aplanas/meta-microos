SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python310-azure-mgmt-logic-10.0.0-1.3.noarch.rpm"
RPM_HASH = "d5b503e2327549ff5a7b9cd9b6f87779ead3e2e6a6b793d912b95efdc23df605baf6b42f763584090ea4c8ede005a671b3859bc7d19aa0ca245d260b1b64cfa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-logic \
python3.10dist-azure-mgmt-logic \
python310-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
