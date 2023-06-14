SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-azure-mgmt-apimanagement-4.0.0-1.1.noarch.rpm"
RPM_HASH = "22ded2ced2d1203550020deddb9e18a025c4923426429bcb06d36f619e1a10ed054e7c591d2b94a487d9bc6c8396d9d50b5f31343c09895bca944a81d4236d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-apimanagement \
python311-azure-mgmt-apimanagement \
python3dist-azure-mgmt-apimanagement"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
