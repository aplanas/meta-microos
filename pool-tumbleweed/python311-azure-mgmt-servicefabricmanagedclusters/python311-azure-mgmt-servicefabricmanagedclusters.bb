SUMMARY = "MS Azure Servicefabricmanagedclusters Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicefabricmanagedclusters Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-servicefabricmanagedclusters-1.0.0-2.2.noarch.rpm"
RPM_HASH = "66056838dc6591d212b0d51b688439a933d43352c6e6a035dc42681a81193de16010e160dde4cc3299d57da59e8d9d510e89810f2cf21cb137a49987794ee709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-servicefabricmanagedclusters \
python311-azure-mgmt-servicefabricmanagedclusters \
python3dist-azure-mgmt-servicefabricmanagedclusters"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
