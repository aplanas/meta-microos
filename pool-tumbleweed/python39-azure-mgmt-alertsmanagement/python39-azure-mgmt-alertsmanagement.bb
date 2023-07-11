SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-alertsmanagement-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "46164c75d35e4191490b3287df07835178f25ce3a0af2c3b7cfebc5d4e120e0c77725948ba67a8e9b7c2a8a495ed05530ba3734ec06366326954bff64f529d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-alertsmanagement \
python39-azure-mgmt-alertsmanagement \
python3dist-azure-mgmt-alertsmanagement"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
