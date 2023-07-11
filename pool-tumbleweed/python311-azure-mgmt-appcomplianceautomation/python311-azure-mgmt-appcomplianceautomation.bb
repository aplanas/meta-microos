SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python311-azure-mgmt-appcomplianceautomation-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "b7363a44a1b27885d9dd323fbc206ff8640906f0ae9fa2ed8ef2bd1d8fa35d7f74d557ea705dd5a1e8e99b72f943d725ecfb92699d3845e8624bce36751eab94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcomplianceautomation \
python3.11dist-azure-mgmt-appcomplianceautomation \
python311-azure-mgmt-appcomplianceautomation \
python3dist-azure-mgmt-appcomplianceautomation"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
