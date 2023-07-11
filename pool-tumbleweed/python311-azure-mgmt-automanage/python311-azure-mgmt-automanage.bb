SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-automanage-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "71d27485e3fdb2318f1470602dfbe05cd3bf4eb1756cfb4e4893735ffe3e02cab536e011eaafd2bb4607790ab49cde522c37344dd5670579908ced3498ee3478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-automanage \
python3.11dist-azure-mgmt-automanage \
python311-azure-mgmt-automanage \
python3dist-azure-mgmt-automanage"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
