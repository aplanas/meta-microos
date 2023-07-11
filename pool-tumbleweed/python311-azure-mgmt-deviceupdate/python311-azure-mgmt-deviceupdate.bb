SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-deviceupdate-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "b5a400ed67f4906b3332ebdf0433a85caabb2c1f08759982a69d67187405c7828f7280417a6caa9b99883a294cb44a37bea735de64343aa6ee9d3a38302b8448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deviceupdate \
python3.11dist-azure-mgmt-deviceupdate \
python311-azure-mgmt-deviceupdate \
python3dist-azure-mgmt-deviceupdate"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
