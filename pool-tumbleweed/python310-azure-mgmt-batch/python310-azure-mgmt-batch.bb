SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.0.0"

RPM_NAME = "python310-azure-mgmt-batch-17.0.0-1.4.noarch.rpm"
RPM_HASH = "39990ad3b0a73feb92d12a87bb5d361759cc5fd4db80cfe3dcd143311af71f1ef839310bb54d5c8457065177ac857dad6e88ad151206d39b178c73106467a749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-batch \
python310-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
