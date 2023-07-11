SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-azure-mgmt-storageimportexport-0.1.0-2.12.noarch.rpm"
RPM_HASH = "1a000bdcf793966150ae029a3a8ee0ca376ba447f165a78372d9921ee38ce5da0b7e0209e4a6b29f8da534544e4269a6eeee02e207517cba67a1ac7bbef901e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storageimportexport \
python39-azure-mgmt-storageimportexport \
python3dist-azure-mgmt-storageimportexport"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
