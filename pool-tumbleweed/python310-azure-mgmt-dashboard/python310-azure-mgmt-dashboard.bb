SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-dashboard-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "08ba4c1894f12652b37a20bb856a0d69dfbf713e1858cbf99de65070470c7656edcf9314754738dd778723edb44d9ef849640ee109dda64b2c56e63a1e21d01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dashboard \
python310-azure-mgmt-dashboard \
python3dist-azure-mgmt-dashboard"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
