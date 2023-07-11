SUMMARY = "Microsoft Azure Testbase Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Testbase Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-testbase-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "ad3828caf0f0a73aadf6eae152085ef9cb290ee6614adb437cd53e963b2b6a9027def843837770fe065d204aeda187ccc8a8e191ebd82cbdcb3d465462cd3997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-testbase \
python3.11dist-azure-mgmt-testbase \
python311-azure-mgmt-testbase \
python3dist-azure-mgmt-testbase"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
