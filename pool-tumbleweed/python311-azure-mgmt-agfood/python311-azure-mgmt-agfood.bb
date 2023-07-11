SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-agfood-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "437b864d15e95e90ffa21169a183ae847d646b9b96e2003864a98a293f5b3f6878b8243b763b2cbe0624956c5c6ba95c6c9ef0b14f5047959ab25c59fe2f6c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agfood \
python3.11dist-azure-mgmt-agfood \
python311-azure-mgmt-agfood \
python3dist-azure-mgmt-agfood"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
