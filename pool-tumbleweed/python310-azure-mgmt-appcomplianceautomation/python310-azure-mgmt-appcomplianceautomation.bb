SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-appcomplianceautomation-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "180b2ede65d3d4df38712b54aa167cb6b6cf07f9491a9f1f7852dc446845d9da101db3ed2603d711dc95af32cb7c2b4717cc9291d68244aeea269a07af00ba67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcomplianceautomation \
python3.10dist-azure-mgmt-appcomplianceautomation \
python310-azure-mgmt-appcomplianceautomation \
python3dist-azure-mgmt-appcomplianceautomation"

RDEPENDS:${PN} += "-python310-typing-extensions >= 4.3.0 if python310-base < 3.8 \
python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
