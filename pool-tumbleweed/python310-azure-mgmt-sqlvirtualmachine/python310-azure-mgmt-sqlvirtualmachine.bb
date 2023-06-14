SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b5"

RPM_NAME = "python310-azure-mgmt-sqlvirtualmachine-1.0.0b5-1.3.noarch.rpm"
RPM_HASH = "066973ff791065e14d652d58f6fa741607291b200510daa74453d21d8adf7e448ebbb5025353dde7d8d0f5c310d7d5f430462fef5bed9abd61531f513723335b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sqlvirtualmachine \
python3.10dist-azure-mgmt-sqlvirtualmachine \
python310-azure-mgmt-sqlvirtualmachine \
python3dist-azure-mgmt-sqlvirtualmachine"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
