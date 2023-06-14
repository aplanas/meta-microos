SUMMARY = "Microsoft Azure Management Groups Client Library"
DESCRIPTION = "This is the Microsoft Azure Management Groups Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-managementgroups-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "1840387dfc80472d5e6e52179c57c7c9dbe74b0f85716a493e1ff83cf36e09dddd24581a865fc945346f29aed1dd8b31e52bf3228e60b276e353a6d415faea9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-managementgroups \
python39-azure-mgmt-managementgroups \
python3dist-azure-mgmt-managementgroups"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
