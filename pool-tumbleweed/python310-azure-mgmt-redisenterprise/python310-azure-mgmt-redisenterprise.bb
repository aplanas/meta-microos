SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-redisenterprise-2.0.0-1.6.noarch.rpm"
RPM_HASH = "8501d904755696c78e4a798f3094f32dcb3a7bb7be011d2b23e2156b3afb2c6d646a9181f399d6a4a355006048b41a5927f0eacfb263d2f2925eeda8b691bf94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redisenterprise \
python3.10dist-azure-mgmt-redisenterprise \
python310-azure-mgmt-redisenterprise \
python3dist-azure-mgmt-redisenterprise"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
