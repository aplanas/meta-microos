SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-mgmt-signalr-1.2.0-1.3.noarch.rpm"
RPM_HASH = "80c6b524cd8eeb695b7fc3cb7292f6395ad8fe290d4c0936411d6fccd3a94d6519ef51f0af0233f857081a394a9cccaaf40bbe2e65ce252b99054a2b8b0a27fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-signalr \
python310-azure-mgmt-signalr \
python3dist-azure-mgmt-signalr"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
