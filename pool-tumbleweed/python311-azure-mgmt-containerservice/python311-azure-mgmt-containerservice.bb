SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "26.0.0"

RPM_NAME = "python311-azure-mgmt-containerservice-26.0.0-1.1.noarch.rpm"
RPM_HASH = "c069e40e2d7176a057bcfedc85772a7a408200a8791ad307816e5801efcad456ea73a81938b3ce70f6108362be717aadf4e6fcdc90f864de77fd12f10d28bd9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservice \
python3.11dist-azure-mgmt-containerservice \
python311-azure-mgmt-containerservice \
python3dist-azure-mgmt-containerservice"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
