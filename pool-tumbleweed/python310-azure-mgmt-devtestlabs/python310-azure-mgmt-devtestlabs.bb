SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-azure-mgmt-devtestlabs-9.0.0-1.10.noarch.rpm"
RPM_HASH = "cff9da61267ba84ca4726d56ecf79081cf5a6cc8388722bc9ee456166d8bf96898a56434acd60cde87018050d9c5e860864cf139d2e172514a43905723be8166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-devtestlabs \
python3.10dist(azure-mgmt-devtestlabs) \
python310-azure-mgmt-devtestlabs \
python3dist(azure-mgmt-devtestlabs)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
