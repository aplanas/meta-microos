SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-notificationhubs-8.0.0-1.7.noarch.rpm"
RPM_HASH = "bcc149df5091e86166a2973947dc16986a818be599c460ef79cd2d16f3446469f03a524b2d3349162df9110c78e26dcf36e161f3d65753a1e378a5f2cac39764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-notificationhubs) \
python39-azure-mgmt-notificationhubs \
python3dist(azure-mgmt-notificationhubs)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
