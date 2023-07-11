SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-signalr-1.2.0-1.3.noarch.rpm"
RPM_HASH = "38cdd70fef6b28760eda4fcdf31d430836ef0590a5af42c815821aa1689715eb33490d631927dfd03efff7b4e6e001c1ef0ea09612b69e792cea35a65cfcd6dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-signalr \
python3.11dist-azure-mgmt-signalr \
python311-azure-mgmt-signalr \
python3dist-azure-mgmt-signalr"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
