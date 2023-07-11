SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-portal-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "44d86403181d8aee8329d0f70aff16f90740579e69a3376a60d998c58dd12898b5cde884c1dbc11e73dcb81881798dbb3b110112e36f9ce91eca55d7b3608170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-portal \
python3.11dist-azure-mgmt-portal \
python311-azure-mgmt-portal \
python3dist-azure-mgmt-portal"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
