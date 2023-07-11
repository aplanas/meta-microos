SUMMARY = "Microsoft Azure DevTestLabs Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DevTestLabs Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-devtestlabs-9.0.0-1.11.noarch.rpm"
RPM_HASH = "64866435d9e970e086321cd531ebd614907c9bf8948a930a9cadaa50fcd5798f3a57b6038c7613f53c8e3052cc486ba7dacae5bd16bab6589762a6358abb1921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-devtestlabs \
python39-azure-mgmt-devtestlabs \
python3dist-azure-mgmt-devtestlabs"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
