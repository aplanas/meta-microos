SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.0.0"

RPM_NAME = "python311-azure-mgmt-storage-21.0.0-1.3.noarch.rpm"
RPM_HASH = "8fae95e4f640a4937a68e8ec53262c7a8b19c6c85095f355e32877b2a93372c31403f7bbef374bbe88e5f33f2a68bfdbca9692b6cbfd389f7101b293a74ad18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-storage \
python311-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
