SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-resourcegraph-8.0.0-1.9.noarch.rpm"
RPM_HASH = "d380114955e77171bff93a94e75a476af420dafd0447b7e49036c0c0d6b6e1383deb062ac63296fc2c693d474ea7c3b0f07f8cf2fcb1972174943372bd371783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcegraph \
python3.11dist-azure-mgmt-resourcegraph \
python311-azure-mgmt-resourcegraph \
python3dist-azure-mgmt-resourcegraph"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
