SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-appcomplianceautomation-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "f7a823019a78b47291cfbc65daf12ad10c797c8fb7b6e4c2d8771dfde3e7163cd030490ef1cb22c2ee479f49bd2e73ababa87cda820190711d36b425536d4a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-appcomplianceautomation \
python310-azure-mgmt-appcomplianceautomation \
python3dist-azure-mgmt-appcomplianceautomation"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
