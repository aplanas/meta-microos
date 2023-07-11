SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-baremetalinfrastructure-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "c4ff96ae4f0d8be2925c4ba93cc6b7782687f1c5d84ebe3d16142b64e81df55079d6d20f4bba83179eedf7c04e8964e04ba77f289a46d28c1239329ba5bc22d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-baremetalinfrastructure \
python3.11dist-azure-mgmt-baremetalinfrastructure \
python311-azure-mgmt-baremetalinfrastructure \
python3dist-azure-mgmt-baremetalinfrastructure"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
