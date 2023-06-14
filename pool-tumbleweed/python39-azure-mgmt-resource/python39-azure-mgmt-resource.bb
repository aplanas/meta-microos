SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.0.1"

RPM_NAME = "python39-azure-mgmt-resource-23.0.1-1.1.noarch.rpm"
RPM_HASH = "f52184d9268badfac536f44f5f7828fc50b1acb21619f1ad193ef32246a8bfd22bee7860f1d4b68acca97816a789f2d644db5ab60a8f596469e7f996081904c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-resource \
python39-azure-mgmt-resource \
python3dist-azure-mgmt-resource"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
