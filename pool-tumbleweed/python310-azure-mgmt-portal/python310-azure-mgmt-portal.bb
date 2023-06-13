SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-portal-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "590e9825c044d55dafe5455fc9b0790df8511c6ec8d972b9f1bc2ca3a3d7405ffb2aac32b4d332dd4962b30d00b58d1331109f67f7f11f5f8938c73667fc5ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-portal \
python3.10dist(azure-mgmt-portal) \
python310-azure-mgmt-portal \
python3dist(azure-mgmt-portal)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
