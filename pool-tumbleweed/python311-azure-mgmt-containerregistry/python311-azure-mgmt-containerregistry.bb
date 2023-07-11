SUMMARY = "Microsoft Azure Container Registry Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Registry Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.1.0"

RPM_NAME = "python311-azure-mgmt-containerregistry-10.1.0-1.3.noarch.rpm"
RPM_HASH = "f4da881a8fdc21a13b61d9141d259034a3346f2a8eb226dceb782c8e66e3411a5b0ea0f021af6098b35a4f084ac4088fa7a309ead95b4828950d1be17ec69c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerregistry \
python3.11dist-azure-mgmt-containerregistry \
python311-azure-mgmt-containerregistry \
python3dist-azure-mgmt-containerregistry"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
