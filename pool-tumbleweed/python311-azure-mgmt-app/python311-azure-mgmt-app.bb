SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-app-1.0.0b2-1.6.noarch.rpm"
RPM_HASH = "4ff9e857c155b90c7995065f5f6a5f7b17b5f723ce64d0ea6bd4ac9a37b9f98927f245f98e32bb776e47e0b47ea559788a26fbcf8ade4f4306fb96903a39b314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-app \
python3.11dist-azure-mgmt-app \
python311-azure-mgmt-app \
python3dist-azure-mgmt-app"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
