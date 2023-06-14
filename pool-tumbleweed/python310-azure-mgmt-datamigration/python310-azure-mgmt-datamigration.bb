SUMMARY = "Microsoft Azure Data Migration Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Migration Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python310-azure-mgmt-datamigration-10.0.0-1.8.noarch.rpm"
RPM_HASH = "731150baead39a385d109258366d501ed4b3b7cdbee25401a1421d00ec0f30c1356313c635dd7ca9ec67a4eb7705a693d8a178dd0c1702ed97f16eea6261cce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datamigration \
python3.10dist-azure-mgmt-datamigration \
python310-azure-mgmt-datamigration \
python3dist-azure-mgmt-datamigration"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
