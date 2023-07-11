SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python39-azure-mgmt-automation-1.1.0b2-1.4.noarch.rpm"
RPM_HASH = "f084577298894ed9680797a5460a3b625dfd6e1c733340df4ea082f19312aa6aa257a2a116398031d6cf098d8b2aaaa96a2722169e47b3813b4fd76b0fd586d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-automation \
python39-azure-mgmt-automation \
python3dist-azure-mgmt-automation"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
