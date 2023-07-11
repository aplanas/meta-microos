SUMMARY = "Microsoft Azure Fluidrelay Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Fluidrelay Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-fluidrelay-1.0.0.0-1.5.noarch.rpm"
RPM_HASH = "92ee8f3b821eeaa40d0fdf1e556234af39e36c5dd408d8b1047e954385aaa196cd32f02072a5ba5334d35f3362dc50c78560f3c62a72093d0ce7f77f85553580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-fluidrelay \
python3.11dist-azure-mgmt-fluidrelay \
python311-azure-mgmt-fluidrelay \
python3dist-azure-mgmt-fluidrelay"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
