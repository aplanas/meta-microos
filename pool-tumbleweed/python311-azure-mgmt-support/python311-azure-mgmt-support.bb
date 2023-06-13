SUMMARY = "Microsoft Azure Support Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Support Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python311-azure-mgmt-support-6.0.0.0-1.8.noarch.rpm"
RPM_HASH = "f95168236184996761fee5e88e8d6e343015b80d2bdd419656928dca7256585b19b9d8f87a8eb8a55d89ab299c9e17ef9c4f82976f75cce23ac7db7fe31c8494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-support) \
python311-azure-mgmt-support \
python3dist(azure-mgmt-support)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
