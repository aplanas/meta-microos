SUMMARY = "MS Azure Servicefabricmanagedclusters Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicefabricmanagedclusters Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-servicefabricmanagedclusters-1.0.0-2.2.noarch.rpm"
RPM_HASH = "1223e0d3885612e119b970d34c397193dca2c6045033c8b413093935aa0270603b26a212d80d2f568bb5102e0780938e7dd625d07054934cc29e9570002b5692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-servicefabricmanagedclusters \
python39-azure-mgmt-servicefabricmanagedclusters \
python3dist-azure-mgmt-servicefabricmanagedclusters"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
