SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-notificationhubs-8.0.0-1.8.noarch.rpm"
RPM_HASH = "50672110d98358142e75ba545fea85b6c9de6b601eba43e1599c153b40857148d3566d4e4c3eb18a77804e93cb60866f38f2dff8951c98460ad7ef04f40b4275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-notificationhubs \
python3.11dist-azure-mgmt-notificationhubs \
python311-azure-mgmt-notificationhubs \
python3dist-azure-mgmt-notificationhubs"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
