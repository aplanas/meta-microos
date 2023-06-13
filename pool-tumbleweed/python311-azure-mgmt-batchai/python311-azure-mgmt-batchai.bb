SUMMARY = "Microsoft Azure Batch AI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch AI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "7.0.0b1"

RPM_NAME = "python311-azure-mgmt-batchai-7.0.0b1-1.8.noarch.rpm"
RPM_HASH = "29f80d3e47546f173c053ef64d9611ecfd125ae0da7ee34a327eb3d30ab3dd9fea46a198b0f73695df13f4a8d939c7ad0a0b0abe4a29a043d5018e1a40bd2cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-batchai) \
python311-azure-mgmt-batchai \
python3dist(azure-mgmt-batchai)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
