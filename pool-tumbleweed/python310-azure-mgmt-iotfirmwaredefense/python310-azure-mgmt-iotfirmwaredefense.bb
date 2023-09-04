SUMMARY = "Microsoft Azure Iotfirmwaredefense Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Iotfirmwaredefense Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-iotfirmwaredefense-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "cab55357caff6bc9372b136a9ac9a4a3d0b99b92858f5f121f95e6ee24dd4089fc1072195c4c7e350ea2e4ec5ad635768be2a72e347160985908afbe7ea2c2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-iotfirmwaredefense \
python310-azure-mgmt-iotfirmwaredefense \
python3dist-azure-mgmt-iotfirmwaredefense"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
