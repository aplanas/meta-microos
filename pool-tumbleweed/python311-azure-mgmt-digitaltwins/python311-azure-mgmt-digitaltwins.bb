SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "python311-azure-mgmt-digitaltwins-6.4.0-1.3.noarch.rpm"
RPM_HASH = "f9b4612db8bd2963bcb7d23e9e37e15758e4e7d84df81c4c5010c68f6367c0eb1953a975a41122931c85e198b2cda53cc6cb681028c707433ba10a5e3ae8f3c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-digitaltwins \
python3.11dist-azure-mgmt-digitaltwins \
python311-azure-mgmt-digitaltwins \
python3dist-azure-mgmt-digitaltwins"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
