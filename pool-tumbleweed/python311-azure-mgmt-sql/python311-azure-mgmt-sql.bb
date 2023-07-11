SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b10"

RPM_NAME = "python311-azure-mgmt-sql-4.0.0b10-1.2.noarch.rpm"
RPM_HASH = "7f8f2facc577eda9232cfb65a9719af94d0cb9a87582ad8cb8a8745f60847e5adaa5750967da7eb3a8d4caf0e01036025d4c7efbd3a12b92a79a91c13cefb120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sql \
python3.11dist-azure-mgmt-sql \
python311-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
