SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-deviceupdate-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "7f437d34fcfe10f38b286855c5a743d64cf3d607f49b61879e0ea458fb6722658c7a1cba05e69d1cbb14928c0f99ee1e55986b1af2c24c6f76ed355d31efba2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-deviceupdate \
python311-azure-mgmt-deviceupdate \
python3dist-azure-mgmt-deviceupdate"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
