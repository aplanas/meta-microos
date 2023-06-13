SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.0.52"

RPM_NAME = "python310-azure-datalake-store-0.0.52-1.8.noarch.rpm"
RPM_HASH = "c220df9a9963b5484f61c29315d1311a27cc3c5ad20908d761ee6bd1cc66896ddabed50fea6942157cdb943093cf2d51684d123f3a5d437315c7f1cf3441ff5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-datalake-store \
python3.10dist(azure-datalake-store) \
python310-azure-datalake-store \
python3dist(azure-datalake-store)"

RDEPENDS:${PN} += "python(abi) \
python310-adal \
python310-azure-nspkg \
python310-cffi \
python310-requests"

inherit rpm
