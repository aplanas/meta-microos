SUMMARY = "Microsoft Azure Authorization Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Authorization Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-authorization-3.0.0-1.3.noarch.rpm"
RPM_HASH = "557604755bb3ed4f7a4d22517c7d35fc5ca5348ea3fdf8b1c87bf845497cd85891dac0f00f6a85d4adfc1857effcbc3c0f843cb22a6b5c425fb02225f1c5be3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-authorization \
python311-azure-mgmt-authorization \
python3dist-azure-mgmt-authorization"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-nspkg \
python311-msrest"

inherit rpm
