SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-securitydevops-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "314c15f0f21088ee3b17eb8fe46196d14668d29edd140994d66ddceff8d82392b08a1507687e00ad3be51e27d5768d9fa71fc888933b4239d520d2c7a32c0dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-securitydevops \
python39-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "-python39-typing-extensions >= 4.3.0 if python39-base < 3.8 \
python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
