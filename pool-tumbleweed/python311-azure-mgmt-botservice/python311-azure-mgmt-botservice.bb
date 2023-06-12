SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python311-azure-mgmt-botservice-2.0.0.0-1.3.noarch.rpm"
RPM_HASH = "12b90991cf8243819217bf9e74f7727641fa37b72c5e4e65d369d7c2f0f9e5ea52d318a4a4243921f2c93e7e48c04c34e792ad3bbf5e8aba50169b06ee774c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-botservice) \
python311-azure-mgmt-botservice \
python3dist(azure-mgmt-botservice)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
