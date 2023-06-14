SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python310-azure-mgmt-storageimportexport-0.1.0-2.11.noarch.rpm"
RPM_HASH = "ce745ec404b17bbc6a0208c5de4a43c14400af7db43f4f1ca260d6ce4202ddfbe0d4fb99958ea6f4c9e16e474da9654d48e6de20b1f75ed8b1e69eb10f08d722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storageimportexport \
python3.10dist-azure-mgmt-storageimportexport \
python310-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest \
python310-msrestazure"

inherit rpm
