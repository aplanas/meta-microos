SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-appcomplianceautomation-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "ba0a8694d003535dd9087574f79654a80ec610c5e3a611096f12c92a74f4dadf0bce0c63fd16e90388a27ff8c79b28f184bce0345fc5dd9482d36b59272f7561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-appcomplianceautomation \
python39-azure-mgmt-appcomplianceautomation \
python3dist-azure-mgmt-appcomplianceautomation"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
