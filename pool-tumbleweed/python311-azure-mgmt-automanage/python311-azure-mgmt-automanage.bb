SUMMARY = "Microsoft Azure Auto Manage Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Auto Manage Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-automanage-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "c5f9bd31a08aad2431231b6beb454a7971d1ab60ee4a42fa714d654ec1a7a6bb0f0e1e5e982b4a54e3cb4619d061f554e5c56bd2e073cb6f3bc5404eb4b841c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-automanage) \
python311-azure-mgmt-automanage \
python3dist(azure-mgmt-automanage)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
