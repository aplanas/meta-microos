SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-networkfunction-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "fb2fbff4f35432fd40ec7fc1195e4c7e56e5dea6d052df7c56691ff2170e5c0a41536eff24daa5127a2384c5559c8c4c2a2e92c6fe789e73ce080ceffbed9e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-networkfunction \
python310-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
