SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-azure-mgmt-avs-7.1.0-1.4.noarch.rpm"
RPM_HASH = "20f1653d68064dbe70318fc6f06e424a9e9748875ba4ba20ce6dd8d124d5eba5ffb873db6434bac56cb24d6fb76db952401d0dc3ab985ef86ad5157aa9e02f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-avs \
python3.11dist-azure-mgmt-avs \
python311-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
