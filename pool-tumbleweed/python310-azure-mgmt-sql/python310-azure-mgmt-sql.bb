SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b12"

RPM_NAME = "python310-azure-mgmt-sql-4.0.0b12-1.1.noarch.rpm"
RPM_HASH = "948b0cdd808d01b4978a7121231127a177e90e5df09d823a0551529428b95139938263c3c8088b37a02057a29f6d909debbe99054d4d0d948f83e963affebd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-sql \
python310-azure-mgmt-sql \
python3dist-azure-mgmt-sql"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
