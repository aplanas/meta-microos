SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-azureadb2c-1.0.0b1-1.11.noarch.rpm"
RPM_HASH = "71e9a1015a3b9a02c5b09fc3ed111ccf16432f1b3dd2e6aa7c71a7c4e7134580482462658d2c1a887ba7c5b7610448e14e59d7a504e06af94325b1bd6726c270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-azureadb2c) \
python39-azure-mgmt-azureadb2c \
python3dist(azure-mgmt-azureadb2c)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
