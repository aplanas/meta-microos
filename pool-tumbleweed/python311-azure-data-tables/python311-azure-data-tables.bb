SUMMARY = "Microsoft Azure Azure Data Tables Client Library for Python"
DESCRIPTION = "Azure Data Tables is a NoSQL data storage service that can be accessed from anywhere in the \
world via authenticated calls using HTTP or HTTPS. Tables scales as needed to support the \
amount of data inserted, and allow for the storing of data with non-complex accessing. \
The Azure Data Tables client can be used to access Azure Storage or Cosmos accounts."
LICENSE = "MIT"

PV = "12.4.2"

RPM_NAME = "python311-azure-data-tables-12.4.2-1.3.noarch.rpm"
RPM_HASH = "bfc865c908fb8eb0ac8a5a07a108c1d0cda877b79c5c3f4a8fb18fce60bebf21fdec81c71b250a98c18f427f53be669221b78c13e64ba6ebd944a47737edba8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-data-tables \
python311-azure-data-tables \
python3dist-azure-data-tables"

RDEPENDS:${PN} += "python-abi \
python311-azure-core \
python311-azure-data-nspkg \
python311-azure-nspkg \
python311-isodate \
python311-msrest \
python311-yarl"

inherit rpm
