SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-storagepool-1.0.0-1.9.noarch.rpm"
RPM_HASH = "cd88e242e440f7897de6f3e4c5a9f2937f1226b3894f597e526ef5eb5c03e0d832022eb6a20f89cf33394d5bc4de35b15e2375815b97fab1036643381fdee9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-storagepool \
python310-azure-mgmt-storagepool \
python3dist-azure-mgmt-storagepool"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
