SUMMARY = "Microsoft Azure Data Migration Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Migration Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-datamigration-10.0.0-1.8.noarch.rpm"
RPM_HASH = "d41fdee3956395060990d5b38375057e72e655f1d9a1ad47c5e9ba10c068fbecaa1abe61213962a226f8d50c4b8f73d14b0e79efb5d31999cadb7a21c72461d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-datamigration \
python311-azure-mgmt-datamigration \
python3dist-azure-mgmt-datamigration"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
