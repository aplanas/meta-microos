SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b3"

RPM_NAME = "python310-azure-mgmt-resourcemover-1.1.0b3-1.4.noarch.rpm"
RPM_HASH = "9c53e3d2461fd78bb78e8b57743703c8b5940058f3e3bedd81fb6ebc554315f342c48d34310230ab40f61b7b83d32dc94fbbaab8ba9777914e6a9954a31484b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-resourcemover \
python310-azure-mgmt-resourcemover \
python3dist-azure-mgmt-resourcemover"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
