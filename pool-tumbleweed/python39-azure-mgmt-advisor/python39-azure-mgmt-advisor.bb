SUMMARY = "Microsoft Azure Advisor Client Library"
DESCRIPTION = "This is the Microsoft Azure Advisor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python39-azure-mgmt-advisor-9.0.0-1.11.noarch.rpm"
RPM_HASH = "50a23dbe3dceeee7e9cc511f00e5bbf3e46a2094b895b1b7fb06ad365e4edf9ac98783fbaec0df617c3e8edc44d6c7b0e4d7a043a8da9e3156ee1cfd60b067dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-advisor \
python39-azure-mgmt-advisor \
python3dist-azure-mgmt-advisor"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
