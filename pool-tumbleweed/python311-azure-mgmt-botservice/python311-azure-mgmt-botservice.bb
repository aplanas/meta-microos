SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python311-azure-mgmt-botservice-2.0.0.0-1.4.noarch.rpm"
RPM_HASH = "c704f945897aa1677fc3b049a5f39cc5c452a93127fa0ab4b2eda53fff85f0bba8dbbc143b8573fe330fe0e41ad2eb227c4a1bb1a0b20045d5130261f8ea8b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-botservice \
python3.11dist-azure-mgmt-botservice \
python311-azure-mgmt-botservice \
python3dist-azure-mgmt-botservice"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
