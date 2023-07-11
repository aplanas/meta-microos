SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python310-azure-mgmt-sqlvirtualmachine-1.0.0b6-1.1.noarch.rpm"
RPM_HASH = "2f5dd27f923bf710053078b6a317c1a2632368e5b3511ac6e02206011e70cc78386a2107d369fe57664725de752fa7e1cca760d32516eb4609dbe1afe8ff4df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-sqlvirtualmachine \
python310-azure-mgmt-sqlvirtualmachine \
python3dist-azure-mgmt-sqlvirtualmachine"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
