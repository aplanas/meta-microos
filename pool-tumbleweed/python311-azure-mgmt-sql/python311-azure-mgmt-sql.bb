SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b12"

RPM_NAME = "python311-azure-mgmt-sql-4.0.0b12-1.1.noarch.rpm"
RPM_HASH = "5c16b38c5126e48e7310aaa19bbb541358dada9865b0a497b368f3ce21d2f0d2a342347d4c39bb849722cc801d9479ce29a9efe3025cc3e36e71e0f2a2a79773"
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
