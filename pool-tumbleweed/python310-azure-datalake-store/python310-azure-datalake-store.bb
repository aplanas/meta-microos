SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.0.52"

RPM_NAME = "python310-azure-datalake-store-0.0.52-1.9.noarch.rpm"
RPM_HASH = "584044601a07ddd7ade3f1e5a5c8b20bc0a92fbc055268d8165ca1f3263ffa0d305bd9aaeca8d32fc2af2d884dc64c3d8cb02b6daacd280670645a6794f6be1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-datalake-store \
python310-azure-datalake-store \
python3dist-azure-datalake-store"

RDEPENDS:${PN} += "python-abi \
python310-adal \
python310-azure-nspkg \
python310-cffi \
python310-requests"

inherit rpm
