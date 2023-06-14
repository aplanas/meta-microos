SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-azure-mgmt-datafactory-3.1.0-1.2.noarch.rpm"
RPM_HASH = "d12fb3b3643cf5f3b9c1818f91862cc008e2104d62fc18dd8af2b5b64fb69f2050994945f5cf3c2f50da7e8eca89cf4b9d4eaf5b69fdce0ea2061feb94f834ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-datafactory \
python311-azure-mgmt-datafactory \
python3dist-azure-mgmt-datafactory"

RDEPENDS:${PN} += "-python311-typing-extensions >= 4.3.0 if python311-base < 3.8 \
python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
