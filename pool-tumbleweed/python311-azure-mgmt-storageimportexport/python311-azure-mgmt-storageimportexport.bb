SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-azure-mgmt-storageimportexport-0.1.0-2.11.noarch.rpm"
RPM_HASH = "7e39d572aa7a7d080b8c4afbeeea9a82188b71c0efdd094d8f10612af6a9bf6cb2a6d2901218ea04bed9633afaf556811b69f499812c2767305e700992b402eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-storageimportexport \
python311-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
