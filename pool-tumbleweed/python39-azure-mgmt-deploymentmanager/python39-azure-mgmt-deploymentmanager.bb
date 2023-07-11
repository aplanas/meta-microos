SUMMARY = "Microsoft Azure Deployment Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Deployment Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-deploymentmanager-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "979dfed68b9cb7966fc0270f574c8d1d3756959af3307acb84373f3da3a57ccd24036b91054da25dcce975247fa069cb364144113d4f92a5250c876457fc349b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-deploymentmanager \
python39-azure-mgmt-deploymentmanager \
python3dist-azure-mgmt-deploymentmanager"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
