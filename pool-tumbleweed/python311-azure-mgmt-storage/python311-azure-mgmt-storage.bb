SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.1.0"

RPM_NAME = "python311-azure-mgmt-storage-21.1.0-1.1.noarch.rpm"
RPM_HASH = "9e1ea48a330ef486a89deba1daccf606f441faf29d2becfa9abd1e4d46a026ec6fdca94468afc9735194b0ddc65d21794046637e85989985433795514746f4fa"
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
python311-isodate"

inherit rpm
