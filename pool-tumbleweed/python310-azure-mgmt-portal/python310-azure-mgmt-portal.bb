SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-portal-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "09ab3fd682f842700a1f31d231a85339e66d9a2f1ec63de28c4b9226ef376d118982c4288cb0f75fe900da1caa540cdccc386891972570a210437844f759f8b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-portal \
python310-azure-mgmt-portal \
python3dist-azure-mgmt-portal"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
