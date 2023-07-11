SUMMARY = "Microsoft Azure Azureadb2c Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azureadb2c Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-azureadb2c-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "d6fe50a1905f33ceb0e1dfd6ea7b1bdbd8aa2121f73a566b2a40e2e34664446de30229b09e80bf45041ef298623353c55ed88774ba6bb02a40217d428cd1d02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azureadb2c \
python3.11dist-azure-mgmt-azureadb2c \
python311-azure-mgmt-azureadb2c \
python3dist-azure-mgmt-azureadb2c"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
