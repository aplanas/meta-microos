SUMMARY = "Microsoft Azure Storage Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Storage Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "21.1.0"

RPM_NAME = "python39-azure-mgmt-storage-21.1.0-1.1.noarch.rpm"
RPM_HASH = "d2065ab03125d636e72e243c0c60578bd38410c75a14d601b2f67bd4a453123816f5c27d4e65e5bea4f321a7d21e0a3fdf28735eab51b235da024db8a09b0541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-storage \
python39-azure-mgmt-storage \
python3dist-azure-mgmt-storage"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
