SUMMARY = "Microsoft Azure Automation Client Library"
DESCRIPTION = "This is the Microsoft Azure Automation Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0b2"

RPM_NAME = "python310-azure-mgmt-automation-1.1.0b2-1.4.noarch.rpm"
RPM_HASH = "c15fb01e2ec391a6af26956cb1a8d17981db7c231ffe31396265233fd228662b1f63467f7a183ff5eb0aaf8de04ceaf677385d49f5c772a9f7997fc03b20bba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-automation \
python310-azure-mgmt-automation \
python3dist-azure-mgmt-automation"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
