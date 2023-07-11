SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-healthcareapis-1.1.0-1.7.noarch.rpm"
RPM_HASH = "62b44230acff75179f5eab4f137a2340126b49dbc4764d2ebeacd3bf6817fb7729cb82a75b0caa17f838d4dc73b7889b78affe488c280a08cf96cb547f369e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-healthcareapis \
python39-azure-mgmt-healthcareapis \
python3dist-azure-mgmt-healthcareapis"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
