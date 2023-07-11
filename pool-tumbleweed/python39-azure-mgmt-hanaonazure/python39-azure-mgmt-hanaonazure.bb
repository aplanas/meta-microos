SUMMARY = "Microsoft Azure SAP Hana on Azure Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SAP Hana on Azure Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-hanaonazure-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "81ee817fa8be03ebcd17a83a7e57e12eb0e107c311b84a6b3efd9a3313ba3549ee551712b8493109ef99b80a2a4152eac27559c2fdc399e09cf3aa2c195782d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-hanaonazure \
python39-azure-mgmt-hanaonazure \
python3dist-azure-mgmt-hanaonazure"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
