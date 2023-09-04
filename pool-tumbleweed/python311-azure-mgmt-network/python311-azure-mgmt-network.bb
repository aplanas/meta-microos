SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "25.0.0"

RPM_NAME = "python311-azure-mgmt-network-25.0.0-1.1.noarch.rpm"
RPM_HASH = "6bbbc9cc40b737342a181c45f61cbb3ee6fb741062f07c3df17637f92e02524ebeb7e761db1cf4711a7fd5d83e5174502405af69b38ad9c855a6dd987e95604f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-network \
python3.11dist-azure-mgmt-network \
python311-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
