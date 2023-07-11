SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python39-azure-mgmt-subscription-3.1.1-1.4.noarch.rpm"
RPM_HASH = "452e94cdc010a1e49af4e301c3f36b406323dbbe5a491813999bba255f02cfa3b346f9cdc18c065caf42bc2ead295c30ad1c51318ad5e783c987dad38e2da0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-subscription \
python39-azure-mgmt-subscription \
python3dist-azure-mgmt-subscription"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
