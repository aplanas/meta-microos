SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.0.0"

RPM_NAME = "python310-azure-mgmt-batch-17.0.0-1.3.noarch.rpm"
RPM_HASH = "30c40bc257e0e70c977992b6a3d37072eb4e7f5f019191aafb3f6f6bcf6a115105b8035396db88be2f230adcef49810d4e0aa5c3be305c33b3dec9bd5df15b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batch \
python3.10dist-azure-mgmt-batch \
python310-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
