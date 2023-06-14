SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-extendedlocation-1.1.0-1.4.noarch.rpm"
RPM_HASH = "9a14d1f70ba32100d6ede9fb48337e5a1cd29713bb8c78054d794bc0d474d44fef8aced1865a376a6e2ad8b669b50f589811a33e4e1a8d3ec26b143595a26a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-extendedlocation \
python3.10dist-azure-mgmt-extendedlocation \
python310-azure-mgmt-extendedlocation \
python3dist-azure-mgmt-extendedlocation"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
