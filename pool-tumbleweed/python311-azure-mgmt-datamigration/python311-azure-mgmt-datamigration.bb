SUMMARY = "Microsoft Azure Data Migration Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Migration Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-datamigration-10.0.0-1.9.noarch.rpm"
RPM_HASH = "199c070b000f3d901112fc99b23a663320d07a55935bde379f227114498ea8a6e1a1a5f7e36cc962fca19a1655c301177dff98abb98d2ddf7e4102a1fd3f0fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datamigration \
python3.11dist-azure-mgmt-datamigration \
python311-azure-mgmt-datamigration \
python3dist-azure-mgmt-datamigration"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
