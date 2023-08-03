SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.1.0"

RPM_NAME = "python39-azure-mgmt-compute-30.1.0-1.1.noarch.rpm"
RPM_HASH = "4ef8391a7e3a70cf7cb1284c52d86a3b3dc043c47003bd9dc1d64fd275c2b72f07941c26f51a35a21a7887488ebefa9b887e8f6f10cf70b7d60466f8e54e7261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-compute \
python39-azure-mgmt-compute \
python3dist-azure-mgmt-compute"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
