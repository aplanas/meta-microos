SUMMARY = "Microsoft Azure SQL Virtual Machine Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Virtual Machine Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b6"

RPM_NAME = "python39-azure-mgmt-sqlvirtualmachine-1.0.0b6-1.1.noarch.rpm"
RPM_HASH = "828fa3b1b7933c4c7bc46cc7c093fcff5c5c46fe2288de888fd815fdd9217d8719fc51037e55127564d5c501ebe2c5932bc189aa16472ee877b6f91a60ea3115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-sqlvirtualmachine \
python39-azure-mgmt-sqlvirtualmachine \
python3dist-azure-mgmt-sqlvirtualmachine"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
