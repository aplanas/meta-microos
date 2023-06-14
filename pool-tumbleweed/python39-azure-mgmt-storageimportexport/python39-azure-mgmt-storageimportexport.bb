SUMMARY = "Microsoft Azure StorageImportExport Management Client Library"
DESCRIPTION = "This is the Microsoft Azure StorageImportExport Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python39-azure-mgmt-storageimportexport-0.1.0-2.11.noarch.rpm"
RPM_HASH = "9fd40c820f9cb51b7e3f77fbbd19f5b9474e61528f66ffa590b9f533fc8eaa664f3f9dfa241b92c708c613b5443ff1bc691afddd4f301ffba6e9b48c5aa15dba"
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
