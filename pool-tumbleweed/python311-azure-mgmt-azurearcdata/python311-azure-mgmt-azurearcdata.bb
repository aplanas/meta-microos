SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-azurearcdata-1.0.0-1.4.noarch.rpm"
RPM_HASH = "1ddb2c8921c25e72c2b674fe7071ecc0a238f39222db2efff0d72a815b5ba1657b229daebd9bb555ba419df90e4a40fc9060272d4a2f16c654f47226a0bbb3eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-azurearcdata \
python3.11dist-azure-mgmt-azurearcdata \
python311-azure-mgmt-azurearcdata \
python3dist-azure-mgmt-azurearcdata"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
