SUMMARY = "Microsoft Azure SignalR Client Library"
DESCRIPTION = "This is the Microsoft Azure SignalR Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-azure-mgmt-signalr-1.2.0-1.2.noarch.rpm"
RPM_HASH = "f0d146e3a6de5c95bac75ed621caab05214266f9d2911f48aacb1f686d6f66d3c6810d4c59f317f6b29e97618c81c7524ba980a4dd3cd0fa5714e80752614ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-signalr) \
python39-azure-mgmt-signalr \
python3dist(azure-mgmt-signalr)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
