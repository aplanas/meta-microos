SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-devtestlabs-9.0.0-1.11.noarch.rpm"
RPM_HASH = "acaea884e54197f77405ef2fb59ac3ccf4b2d30194258c240046b1b8ff1a8f3987c4f4906a104bd8d69928ff4339e27e19a6c9d69bf61cd6097994805caf22e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devtestlabs \
python3.11dist-azure-mgmt-devtestlabs \
python311-azure-mgmt-devtestlabs \
python3dist-azure-mgmt-devtestlabs"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
