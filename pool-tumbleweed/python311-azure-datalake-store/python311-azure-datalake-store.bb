SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.0.52"

RPM_NAME = "python311-azure-datalake-store-0.0.52-1.9.noarch.rpm"
RPM_HASH = "dda1328010edd6c70f0f03022f0e61faf1c6bad0d8f0175e59a3ce307862eb64a77718751f9a2c53bb71e3fb89520a80e7759e46dc9a29a3a64edef4d3dadc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-datalake-store \
python3.11dist-azure-datalake-store \
python311-azure-datalake-store \
python3dist-azure-datalake-store"

RDEPENDS:${PN} += "python-abi \
python311-adal \
python311-azure-nspkg \
python311-cffi \
python311-requests"

inherit rpm
