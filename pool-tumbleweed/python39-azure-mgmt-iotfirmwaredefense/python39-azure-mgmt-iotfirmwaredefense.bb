SUMMARY = "Microsoft Azure Iotfirmwaredefense Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotfirmwaredefense Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-iotfirmwaredefense-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "6070d15179bc2da803c46d991231dee57e8607026ece52c73bdccd00ff9b737baed96a6c3c326d69a54dc0a3f6a18b935c8e7593589142228fcf5658f54e9186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-iotfirmwaredefense \
python39-azure-mgmt-iotfirmwaredefense \
python3dist-azure-mgmt-iotfirmwaredefense"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
