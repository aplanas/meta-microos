SUMMARY = "Microsoft Azure NetApp Files Management Client Library"
DESCRIPTION = "This is the Microsoft Azure NetApp Files Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-netapp-10.0.0-1.2.noarch.rpm"
RPM_HASH = "e7b68ae723d3eb70e1ab0e20316edd4e212864577b518f8d0b0f9a280250752f0fae0ca0de970ee080b67610cea3fbe26d450c8328cfa59fc58b7b4de7dd8687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-netapp \
python3.11dist-azure-mgmt-netapp \
python311-azure-mgmt-netapp \
python3dist-azure-mgmt-netapp"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
