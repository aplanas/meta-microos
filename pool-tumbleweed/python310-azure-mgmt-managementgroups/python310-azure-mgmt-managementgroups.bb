SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-managementgroups-1.0.0.0-1.9.noarch.rpm"
RPM_HASH = "04e8e407bb0e44d54a0e0f1778add828dd585c3e00414a4fb373cf8fc18dcde3ed63e7b8ce6eab60744dbcba61969cabc11b34b8c5ee9f901ecafe887bcfe9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-managementgroups \
python310-azure-mgmt-managementgroups \
python3dist-azure-mgmt-managementgroups"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
