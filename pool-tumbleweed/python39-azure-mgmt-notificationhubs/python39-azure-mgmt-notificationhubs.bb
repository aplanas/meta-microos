SUMMARY = "Microsoft Azure Notification Hubs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Notification Hubs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-notificationhubs-8.0.0-1.8.noarch.rpm"
RPM_HASH = "117b7f52049043a7f156acd79a6b19a2351c5456bf2d12b6be016109fcc005a1d458c4e9f19dd49e7c8c9651aa2c4fabc44ff1cbd31f5cc8537ff1f0a23ef2fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-notificationhubs \
python39-azure-mgmt-notificationhubs \
python3dist-azure-mgmt-notificationhubs"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
