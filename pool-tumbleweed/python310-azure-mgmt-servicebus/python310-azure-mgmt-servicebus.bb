SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python310-azure-mgmt-servicebus-8.2.0-1.4.noarch.rpm"
RPM_HASH = "14db5eda8a21ec0197ef7bc0d319250cdb70d3088614ebc43cf328f2a8a6ccb9fa56ca4930345d1bcfbf83c82dd4562ee9d58f9ab94fe9bfff8390cdd29664b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-servicebus \
python310-azure-mgmt-servicebus \
python3dist-azure-mgmt-servicebus"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
