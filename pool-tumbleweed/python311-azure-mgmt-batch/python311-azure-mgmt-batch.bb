SUMMARY = "Microsoft Azure Batch Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "17.1.0"

RPM_NAME = "python311-azure-mgmt-batch-17.1.0-1.1.noarch.rpm"
RPM_HASH = "fbf4d4b62303a4aef5739d495d146be78703a80787b24444ceaae503bfd5fe6ebd491192e9c9762d0961a9ebb548aff08bab68fc257b5e370b2ffb78c8a84966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-batch \
python3.11dist-azure-mgmt-batch \
python311-azure-mgmt-batch \
python3dist-azure-mgmt-batch"

RDEPENDS:${PN} += "-python311-azure-common >= 1.1 with python311-azure-common < 2.0.0 \
-python311-azure-mgmt-core >= 1.3.2 with python311-azure-mgmt-core < 2.0.0 \
-python311-isodate >= 0.6.1 with python311-isodate < 1.0.0 \
python-abi \
python311-azure-mgmt-nspkg \
python311-azure-nspkg"

inherit rpm
