SUMMARY = "Microsoft Azure Dynatrace Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dynatrace Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-dynatrace-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "971fdd238d1091eb2582cbe47d516a3dea4f1b9b0eca94f78db204012b5d5d0332f9670e278b6e82b6eebf14a385b6febd04bc32fa566b1b08b5c315ab8a32a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-dynatrace \
python310-azure-mgmt-dynatrace \
python3dist-azure-mgmt-dynatrace"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
