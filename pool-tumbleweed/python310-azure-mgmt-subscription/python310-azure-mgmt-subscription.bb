SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python310-azure-mgmt-subscription-3.1.1-1.3.noarch.rpm"
RPM_HASH = "decbeb9b76de2f4afabfb8e1a9a3541152092f5f5c7780877e9ca7e80d7159d7864d66f27c38331fff688a5629f608678ef8845ceb947d5ec387089c3922b814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-subscription \
python3.10dist(azure-mgmt-subscription) \
python310-azure-mgmt-subscription \
python3dist(azure-mgmt-subscription)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
