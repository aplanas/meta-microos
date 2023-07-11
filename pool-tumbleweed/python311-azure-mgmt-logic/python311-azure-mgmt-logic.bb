SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-logic-10.0.0-1.4.noarch.rpm"
RPM_HASH = "eb8f81f204fe091a66fc478235f8f8a74d1d7674fe9ad9d5596fc3e8ddb9648b1e260375b5e85ac7ec1e4717c73217a557e003e32c19ee64c349cc7136b7fffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-logic \
python3.11dist-azure-mgmt-logic \
python311-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
