SUMMARY = "Microsoft Azure Managed Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Managed Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python310-azure-mgmt-managedservices-6.0.0.0-1.8.noarch.rpm"
RPM_HASH = "f91d9d8e6e537e5b4ecf09303fd1e0dcf217d48a5dcc581d914c21bdafdec9980ab0d52465f4299bbf7a2ae7ba3615676a3052ebb5db43fa8036c089d94a3027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-managedservices \
python3.10dist-azure-mgmt-managedservices \
python310-azure-mgmt-managedservices \
python3dist-azure-mgmt-managedservices"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
