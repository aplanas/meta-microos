SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-frontdoor-1.1.0-1.2.noarch.rpm"
RPM_HASH = "b666447a608a5222a502548dcf19fdae438c0ff3e575d60b7cb35f82a7fcd9ad2e957edb7da8ae06f79c7029b04dfb2ccbda645359d1729725438973f19af5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-mgmt-frontdoor \
python39-azure-mgmt-frontdoor \
python3dist-azure-mgmt-frontdoor"

RDEPENDS:${PN} += "python-abi \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
