SUMMARY = "Microsoft Azure Data Lake Store Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-datalake-store-1.0.0-1.10.noarch.rpm"
RPM_HASH = "44aef17ca496c89cdc680530c1c5acd52f7c2ad3587a5d5239d5b90c36eb5282aa419f6cfbb577cd38aec6247810c6f88c87ea860c4a5378fc5722af44697429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-store \
python3.10dist-azure-mgmt-datalake-store \
python310-azure-mgmt-datalake-store \
python3dist-azure-mgmt-datalake-store"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-datalake-nspkg \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
