SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-storagepool-1.0.0-1.9.noarch.rpm"
RPM_HASH = "c9f9cdac104a11fc2da6e7c9fddcc71be06c081963896cad44e7ab32fbcb9d17aadcbf56d885749f3b2895265095791e59cd1de3fe03bb48b8e0364a5e48cf74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-storagepool \
python3.11dist-azure-mgmt-storagepool \
python311-azure-mgmt-storagepool \
python3dist-azure-mgmt-storagepool"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
