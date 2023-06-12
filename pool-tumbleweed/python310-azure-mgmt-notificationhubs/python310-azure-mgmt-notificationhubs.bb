SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-notificationhubs-8.0.0-1.7.noarch.rpm"
RPM_HASH = "0e7618645d5b11003bd438626baebcdd4b25c58e994cee9dbd44fdeb2c5d340e1c5725123f7aeba746c1c23fcb2e60101389e1553b317fcb32a06a0ede8b4da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-notificationhubs \
python3.10dist(azure-mgmt-notificationhubs) \
python310-azure-mgmt-notificationhubs \
python3dist(azure-mgmt-notificationhubs)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
