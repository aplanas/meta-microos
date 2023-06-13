SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-azure-mgmt-edgegateway-0.1.0-2.18.noarch.rpm"
RPM_HASH = "2aeb5a7b393144bae86e5a9e3a2c877abf3a99a0d17feb23e0400b3b2785bf771b4de07747784a48524afacfba520dab1efd6e97ecdf4f65c26414377ccdc108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-edgegateway) \
python39-azure-mgmt-edgegateway \
python3dist(azure-mgmt-edgegateway)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
