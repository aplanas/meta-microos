SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-deploymentmanager-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "c78a1de797d68f109b795e8698e80cfcc2b24378a351bdd158027db1ac8381163c7ee3eccfe454a9e515e6940b645184c91f22376055d717eabdd03a5435671b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deploymentmanager \
python3.11dist-azure-mgmt-deploymentmanager \
python311-azure-mgmt-deploymentmanager \
python3dist-azure-mgmt-deploymentmanager"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
