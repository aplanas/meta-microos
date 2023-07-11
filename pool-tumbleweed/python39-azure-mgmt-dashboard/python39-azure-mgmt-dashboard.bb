SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-dashboard-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "8fcab2970e6fc3f6028d11037783a504aa0ad9054c4b1c7ec01a2cdad108ccca860a835d4dbb790ed4974b9dc38b258ae082b20641129911fa75bebfdeb712ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-dashboard \
python39-azure-mgmt-dashboard \
python3dist-azure-mgmt-dashboard"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
