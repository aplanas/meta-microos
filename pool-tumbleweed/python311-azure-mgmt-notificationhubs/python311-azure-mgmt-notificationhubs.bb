SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-notificationhubs-8.0.0-1.7.noarch.rpm"
RPM_HASH = "02634caabb7ecce6d93494564a4286619a60768ab29fe1f158d35d2d03c9bf707dbf5d8668ebd3dcab335cde3a34c657442ba52ea3cab203f46ee133b16f2b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-notificationhubs) \
python311-azure-mgmt-notificationhubs \
python3dist(azure-mgmt-notificationhubs)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
