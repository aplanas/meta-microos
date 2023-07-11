SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.0.52"

RPM_NAME = "python39-azure-datalake-store-0.0.52-1.9.noarch.rpm"
RPM_HASH = "5d24267e9dfe72f10555a799962e7e5269222b91916263e20da0509c81a0ba2677f07156bdd4049036d06ff74a403c2d99a30302d6b98550e606bcbc388e9e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-datalake-store \
python39-azure-datalake-store \
python3dist-azure-datalake-store"

RDEPENDS:${PN} += "python-abi \
python39-adal \
python39-azure-nspkg \
python39-cffi \
python39-requests"

inherit rpm
