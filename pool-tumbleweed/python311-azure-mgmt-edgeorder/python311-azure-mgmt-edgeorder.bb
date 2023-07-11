SUMMARY = "Microsoft Azure Edgeorder Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgeorder Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-edgeorder-1.0.0.0-1.7.noarch.rpm"
RPM_HASH = "6c2882d3969c71d641a2020917d6919887dd88565f0d0d86f4ea881d60b2bef126c658d68d8c2097b269d8bc10adf11bc1ca9aa90a7507eecd6f34b6692de51f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-edgeorder \
python3.11dist-azure-mgmt-edgeorder \
python311-azure-mgmt-edgeorder \
python3dist-azure-mgmt-edgeorder"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
