SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-azure-mgmt-signalr-1.2.0-1.2.noarch.rpm"
RPM_HASH = "9a1c62d9f128efab7f0a65fa73b3d3b74ac92ec91a23c61720968f4cd27da4ff442421577f0730824bec095764b2767f1144147d6a5d02f673f2bec684da76a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-signalr \
python311-azure-mgmt-signalr \
python3dist-azure-mgmt-signalr"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
