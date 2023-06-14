SUMMARY = "Microsoft Azure Data Migration Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Migration Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python39-azure-mgmt-datamigration-10.0.0-1.8.noarch.rpm"
RPM_HASH = "1524a1eb162efa141869d6c43afba2a8c327087b0659b9c5f458dab29124812ac2ee1f1cb9ba092ee0d1d7802562d8ea5529218ca60bb423d3c1dc676176d80f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-datamigration \
python39-azure-mgmt-datamigration \
python3dist-azure-mgmt-datamigration"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
