SUMMARY = "Microsoft Azure Oep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Oep Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-oep-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "53aa00769603341e301bdc14204da944c31865f9115c2394e7674d98479cae7fbe2b7cdc745155fe2ec6c78bf4989dbddc778ab7f5dc63a76db5ee1b09d76782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-oep) \
python311-azure-mgmt-oep \
python3dist(azure-mgmt-oep)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
