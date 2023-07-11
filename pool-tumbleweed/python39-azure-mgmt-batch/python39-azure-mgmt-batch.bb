SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.0.0"

RPM_NAME = "python39-azure-mgmt-batch-17.0.0-1.4.noarch.rpm"
RPM_HASH = "72139265eb6ef781987c4b8d1a08416eab79bbcdeb2bc4918dc34491369ccb90e24719f184f1d6736135581826b68aab4fc0734822285a652bbc44ee8bbcc6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-batch \
python39-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
