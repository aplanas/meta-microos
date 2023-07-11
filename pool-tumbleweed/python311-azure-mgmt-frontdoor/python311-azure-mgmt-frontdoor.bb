SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-frontdoor-1.1.0-1.2.noarch.rpm"
RPM_HASH = "20bbefd0ffddd80af2d0fc9b843deef9edf3ca9b7120576d59b39bdd11136c67818278a22a9d0b7eceab36285ee8e0800144c54d64b3d64d2a96871b76d37d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-frontdoor \
python3.11dist-azure-mgmt-frontdoor \
python311-azure-mgmt-frontdoor \
python3dist-azure-mgmt-frontdoor"

RDEPENDS:${PN} += "python-abi \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-isodate"

inherit rpm
