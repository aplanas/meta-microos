SUMMARY = "MS Azure Servicefabricmanagedclusters Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicefabricmanagedclusters Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-servicefabricmanagedclusters-1.0.0-2.3.noarch.rpm"
RPM_HASH = "dbbeb37482df1c8c86a4307072509b0ca89ae14ecb39524b419ecb1f573a2e7f620c1bd699504e14a5ee2f1ba3ee740e964e84aed1634b10222f22ab8ad5c07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicefabricmanagedclusters \
python3.11dist-azure-mgmt-servicefabricmanagedclusters \
python311-azure-mgmt-servicefabricmanagedclusters \
python3dist-azure-mgmt-servicefabricmanagedclusters"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
