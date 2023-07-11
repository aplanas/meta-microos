SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-redisenterprise-2.0.0-1.7.noarch.rpm"
RPM_HASH = "a59c44955e7df60663a652f8fa3314f994a00d1a18ce9d329655b9779f2eada181a9012c30873ee5d8976e83ae2dc679dd4088f18940ae8f868446671f539e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redisenterprise \
python3.11dist-azure-mgmt-redisenterprise \
python311-azure-mgmt-redisenterprise \
python3dist-azure-mgmt-redisenterprise"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
