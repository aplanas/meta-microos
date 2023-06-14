SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-frontdoor-1.1.0-1.1.noarch.rpm"
RPM_HASH = "c202732f29bcae18f9451d07001f548cda378cf33715b86e3222b18e9134e620455ee365f819d43ce103bf75d13838d1079636a947b05292dee158de47d54307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-azure-mgmt-frontdoor \
python311-azure-mgmt-frontdoor \
python3dist-azure-mgmt-frontdoor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
