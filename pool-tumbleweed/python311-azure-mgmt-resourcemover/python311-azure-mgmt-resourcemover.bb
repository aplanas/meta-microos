SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b3"

RPM_NAME = "python311-azure-mgmt-resourcemover-1.1.0b3-1.3.noarch.rpm"
RPM_HASH = "5343fce7aa707e50369a941a0e78b230a4b70cc0348fc394cb32c9f6b99af0b200b97f4fb066b9a1a5a07c88f7783c19129ca22031c68f4bb12853bf95463cbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-resourcemover) \
python311-azure-mgmt-resourcemover \
python3dist(azure-mgmt-resourcemover)"

RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
