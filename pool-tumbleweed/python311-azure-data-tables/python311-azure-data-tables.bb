SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.4.3"

RPM_NAME = "python311-azure-data-tables-12.4.3-1.1.noarch.rpm"
RPM_HASH = "132ae6b2b6e6997fef2479cf78a07010c6e75ab2c82dd41dfd7b2d9ed306695633284c6268e241bf0174efb3b93c71c65b031e587468fe764d15bf739ffbcfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-data-tables \
python3.11dist-azure-data-tables \
python311-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-data-nspkg \
python311-azure-nspkg \
python311-isodate \
python311-yarl"

inherit rpm
