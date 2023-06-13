SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-alertsmanagement-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "c83515f1b47b977af944e40d245ead703af735e9ee69b1c86535a47132267fda0f17335bec8fe7e11864b1363d2ae04ef47972f47e0ecae2f7de19b2d88598de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-alertsmanagement) \
python39-azure-mgmt-alertsmanagement \
python3dist(azure-mgmt-alertsmanagement)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
