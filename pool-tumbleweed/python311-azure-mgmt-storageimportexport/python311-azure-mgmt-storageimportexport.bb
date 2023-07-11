SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python311-azure-mgmt-storageimportexport-0.1.0-2.12.noarch.rpm"
RPM_HASH = "6fac32dbe2d056e17a7c06d6427bf37f4d8d077f61cd194a215248873557e885e466fb15aa7e2b5f1703a563a6ebe15b2268636b286319208ca0614cb4488cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storageimportexport \
python3.11dist-azure-mgmt-storageimportexport \
python311-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest \
python311-msrestazure"

inherit rpm
