SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-azure-mgmt-advisor-9.0.0-1.10.noarch.rpm"
RPM_HASH = "0ca76b95622cacef40efa10bd2378d766bf7791b90921b00429eb491b612d16c3cae9cda66cb3914e7a4c179204c8bcc8996c45ec115ec01d535b923166d94c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-advisor \
python3.10dist-azure-mgmt-advisor \
python310-azure-mgmt-advisor \
python3dist-azure-mgmt-advisor"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
