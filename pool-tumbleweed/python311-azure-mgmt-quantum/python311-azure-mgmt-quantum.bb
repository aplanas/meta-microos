SUMMARY = "Microsoft Azure Quantum Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quantum Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python311-azure-mgmt-quantum-1.0.0b3-1.4.noarch.rpm"
RPM_HASH = "3404e200f00d15427659609d52cd437c23fafb862bdee949b1c7248aaefea2257fa0ed55ff7dfc8d9075e5de9e8dee0be1158c7ada78a384ad5b2d4d630efb79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-quantum \
python3.11dist-azure-mgmt-quantum \
python311-azure-mgmt-quantum \
python3dist-azure-mgmt-quantum"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
