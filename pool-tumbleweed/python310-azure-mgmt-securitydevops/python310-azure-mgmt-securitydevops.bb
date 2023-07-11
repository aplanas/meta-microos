SUMMARY = "Microsoft Azure Securitydevops Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Securitydevops Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-securitydevops-1.0.0~b2-1.4.noarch.rpm"
RPM_HASH = "6c564b8f60ff3ccbf28a55d0cda6bbe6ec49f8782411f435e6cc8833b2c1cec12d0faebf2e6e5378dd22e08c581e26e59ddab55c0f46352c35df660e8f4a9043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-securitydevops \
python310-azure-mgmt-securitydevops \
python3dist-azure-mgmt-securitydevops"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
