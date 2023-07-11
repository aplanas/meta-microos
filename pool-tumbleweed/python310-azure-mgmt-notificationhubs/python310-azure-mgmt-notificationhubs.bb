SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-notificationhubs-8.0.0-1.8.noarch.rpm"
RPM_HASH = "35a3071bba772d4f21251c4a9b2499437551885309a3598fbdde34cd3c9c0db8402c81cca69e33fc1498bc858c6282e73888f8490d6da4b6c3831ff194001272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-notificationhubs \
python310-azure-mgmt-notificationhubs \
python3dist-azure-mgmt-notificationhubs"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
