SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python311-azure-mgmt-storage-21.0.0-1.4.noarch.rpm"
RPM_HASH = "04eda929094775dc6a79e576b43826163c6b54ed01bdfeb599c0cd8d483faa09cc613eae5fdb09489774c5f73a9d2aa0767cd916b74d9cc948f1511f68b2a0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storage \
python3.11dist-azure-mgmt-storage \
python311-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
