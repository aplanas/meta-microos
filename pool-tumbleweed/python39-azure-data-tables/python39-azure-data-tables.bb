SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.4.2"

RPM_NAME = "python39-azure-data-tables-12.4.2-1.3.noarch.rpm"
RPM_HASH = "e54af4e7871c06e48f988e1da37914a76e343660a8817068ed9bd6777d4a939ef0c8bcd9cf178c9f4795549144998508a952ab9cfbcc5fc2c7f7d49f195c476d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-data-tables \
python39-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-data-nspkg \
python39-azure-nspkg \
python39-isodate \
python39-msrest \
python39-yarl"

inherit rpm
