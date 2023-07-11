SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-costmanagement-4.0.0-1.2.noarch.rpm"
RPM_HASH = "c8b451d4517ea9014aec77a1dbc700ca8d701906b8c34b4ab56c5b6be8759eecc23a9020578a782d81540a0a407a4619964a5f9957e0e7b90b39605bc6148672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-costmanagement \
python3.11dist-azure-mgmt-costmanagement \
python311-azure-mgmt-costmanagement \
python3dist-azure-mgmt-costmanagement"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
