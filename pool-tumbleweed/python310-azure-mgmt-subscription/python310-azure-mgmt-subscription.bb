SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python310-azure-mgmt-subscription-3.1.1-1.4.noarch.rpm"
RPM_HASH = "7fb4014e3d1842dcde6132fd5e4d3157f8ac4b115ca355213c66260b0d393dbff06e69ddd0db7ff40e02e3dfdbf32b8c9c7c667fb924787efcc6bbdbc7bce327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-subscription \
python310-azure-mgmt-subscription \
python3dist-azure-mgmt-subscription"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
