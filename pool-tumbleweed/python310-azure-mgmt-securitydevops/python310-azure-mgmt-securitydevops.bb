SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-securitydevops-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "909f4ad193b837be571c3e514be24dd5dda723a0dbaa9924509fc2c23394bce16d5339c128ea321c77ce48f28453095c49baaa77b39fcc3804140836f1ab4fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-securitydevops \
python3.10dist-azure-mgmt-securitydevops \
python310-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
