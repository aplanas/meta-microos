SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-databoxedge-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "4984dc1dcec6ca9fc13a80c895f738e51efca5623dd5c1802bbd2371d06a555adb66806dc3eb810a0f477160832b5cbfb464868dffadb720135febddf3c7049d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databoxedge \
python3.11dist-azure-mgmt-databoxedge \
python311-azure-mgmt-databoxedge \
python3dist-azure-mgmt-databoxedge"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
