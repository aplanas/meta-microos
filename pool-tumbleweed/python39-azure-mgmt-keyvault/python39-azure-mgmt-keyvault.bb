SUMMARY = "Microsoft Azure Key Vault Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.3"

RPM_NAME = "python39-azure-mgmt-keyvault-10.2.3-1.1.noarch.rpm"
RPM_HASH = "c763459ff499f472040564b7d0daa00dc44f6cde522100b04183862c12f1e1b9901f5e2a1add6545c9f8345ab9216590c69538ecac808f900b946223ab68ea22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-keyvault \
python39-azure-mgmt-keyvault \
python3dist-azure-mgmt-keyvault"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
