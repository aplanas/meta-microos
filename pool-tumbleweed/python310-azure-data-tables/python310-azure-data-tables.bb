SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.4.2"

RPM_NAME = "python310-azure-data-tables-12.4.2-1.3.noarch.rpm"
RPM_HASH = "51726edaae49f9c65b3648d1119f80832abbbb197c9c96c2f4f276a6c7218be3e228e66215cb31039b831081d315c59548a118400aaff7ff7c1ecfb85d5c8b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-data-tables \
python3.10dist-azure-data-tables \
python310-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-data-nspkg \
python310-azure-nspkg \
python310-isodate \
python310-msrest \
python310-yarl"

inherit rpm
