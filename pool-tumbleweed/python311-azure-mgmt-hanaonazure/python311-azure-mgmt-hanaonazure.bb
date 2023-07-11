SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-hanaonazure-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "32fabb60aab45a9814622580990201c02d336853e7a6e07b50c3885bc3b9de60ba74e504ab97352922a3ef00bafafafaf1ee9c60c32a38f58f1b75ee63360695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hanaonazure \
python3.11dist-azure-mgmt-hanaonazure \
python311-azure-mgmt-hanaonazure \
python3dist-azure-mgmt-hanaonazure"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
