SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-devtestlabs-9.0.0-1.10.noarch.rpm"
RPM_HASH = "0fd0ea9e696bbc6f4ea9e432b8519bd17c06bd2168fa47288674f447032d312178a27ab9742c4c5e856a4a48f9c4111cce5dbc9ccc922d3f0482607609577415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-devtestlabs) \
python311-azure-mgmt-devtestlabs \
python3dist(azure-mgmt-devtestlabs)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
