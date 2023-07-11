SUMMARY = "Microsoft Azure Search Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Search Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python311-azure-mgmt-search-9.0.0-1.4.noarch.rpm"
RPM_HASH = "583d5d9303c07992893f072d16b2bea963a0a4e55f20bb01677bdd38a89c9fc3145cec056c6e46b0d9e40a298c346de9bd9c3c47bc113271ee4a7f9a37e16c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-search \
python3.11dist-azure-mgmt-search \
python311-azure-mgmt-search \
python3dist-azure-mgmt-search"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
