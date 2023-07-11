SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-azure-mgmt-storageimportexport-0.1.0-2.12.noarch.rpm"
RPM_HASH = "97e69f75c8bad6ad99577034c4a9b98b8731678c19b4f68a917515a1c562906b3382ac6b93fdd245d5c673f8e26a8dc32faa424ac94ca27958acd75caecbdc47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storageimportexport \
python310-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
