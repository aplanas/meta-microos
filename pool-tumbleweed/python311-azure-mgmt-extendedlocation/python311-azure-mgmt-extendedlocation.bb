SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-extendedlocation-1.1.0-1.5.noarch.rpm"
RPM_HASH = "a9d01770908bffe52275ea9e8b0c8ebd436eb129af4338c57b880f1a7b0334d36ed5b0b43197fbb880982967ed9f42df9668347710f6fd40ca8f97645d40c236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-extendedlocation \
python3.11dist-azure-mgmt-extendedlocation \
python311-azure-mgmt-extendedlocation \
python3dist-azure-mgmt-extendedlocation"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
