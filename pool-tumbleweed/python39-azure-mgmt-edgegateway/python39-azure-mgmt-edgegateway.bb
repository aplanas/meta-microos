SUMMARY = "Microsoft Azure Data Box Edge / Data Box Gateway Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Box Edge / Data Box Gateway Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-azure-mgmt-edgegateway-0.1.0-2.19.noarch.rpm"
RPM_HASH = "5ad8ef1030e24845afaedcaa71761bc22f4b9c9ae9e637cee07deb85c4f49407812ea07f36c13e30dc9e2751edd6b5ad888fadcab232106ed4d26c7165b17e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-edgegateway \
python39-azure-mgmt-edgegateway \
python3dist-azure-mgmt-edgegateway"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
