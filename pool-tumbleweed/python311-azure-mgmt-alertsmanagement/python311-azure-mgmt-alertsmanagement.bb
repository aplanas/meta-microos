SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-alertsmanagement-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "990c062a8d534489f654e88060958b5d7f3da07533f5a7ff4b543bfbad5c7c01c878fd2dae5ff7dcd4a908fe159780665043ae10517463a17abf2ee333093d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-alertsmanagement \
python3.11dist-azure-mgmt-alertsmanagement \
python311-azure-mgmt-alertsmanagement \
python3dist-azure-mgmt-alertsmanagement"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
