SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "python310-azure-mgmt-digitaltwins-6.4.0-1.3.noarch.rpm"
RPM_HASH = "d22a7df13a9dd826a612ef64c381ccc6fa93ec6c33f37f21dde78bf5ca1b4d5ef403d0df751759e933c91b3f2da2ade743568a7df63c10eeda64916b0f103f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-digitaltwins \
python310-azure-mgmt-digitaltwins \
python3dist-azure-mgmt-digitaltwins"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
