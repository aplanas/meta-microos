SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.4.3"

RPM_NAME = "python310-azure-data-tables-12.4.3-1.1.noarch.rpm"
RPM_HASH = "69c3b6b17a218fd6681b45a67740b39ebca12a14bfd36b875452cc132977ca6a09d1628c5b2e0efd626f0b54c2f09a88b0209b4798945d7e26ae26b1067b45d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-data-tables \
python310-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-data-nspkg \
python310-azure-nspkg \
python310-isodate \
python310-yarl"

inherit rpm
