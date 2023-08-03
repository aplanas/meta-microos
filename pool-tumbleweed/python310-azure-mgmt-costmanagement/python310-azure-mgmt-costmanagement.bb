SUMMARY = "Microsoft Azure Cost Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cost Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python310-azure-mgmt-costmanagement-4.0.1-1.1.noarch.rpm"
RPM_HASH = "71508985b2cf20ddae6a26a64eabec44ca9773ded5dd4786b9ffb26bafe5780c4511b03b67ef559231cc5188dc37132743f809b5b246ec8bf2c12f323200fa6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-costmanagement \
python310-azure-mgmt-costmanagement \
python3dist-azure-mgmt-costmanagement"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
