SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.4.3"

RPM_NAME = "python39-azure-data-tables-12.4.3-1.1.noarch.rpm"
RPM_HASH = "a2f02ac29c0cc692a87a1b90942f88e764457c12820535cfe32e766950d0832b61b69685af450f4de74d3148ca83ee4d7f5983f95239d3cf520ec1ed96410d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-data-tables \
python39-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-data-nspkg \
python39-azure-nspkg \
python39-isodate \
python39-yarl"

inherit rpm
