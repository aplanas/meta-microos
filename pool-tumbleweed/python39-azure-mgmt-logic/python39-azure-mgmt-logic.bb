SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python39-azure-mgmt-logic-10.0.0-1.3.noarch.rpm"
RPM_HASH = "704d98bbadbd0ef60f3c193687f75424e6a696d86d0b17253a3596d9e8086f428f5f6abefe28cc228263de4d8dfb775c6ac5028e02f7c167b96bfbed5ee9956b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-logic \
python39-azure-mgmt-logic \
python3dist-azure-mgmt-logic"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
