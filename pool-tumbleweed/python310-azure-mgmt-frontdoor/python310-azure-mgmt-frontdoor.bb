SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-frontdoor-1.1.0-1.1.noarch.rpm"
RPM_HASH = "65c14b44619c38d588d5a13ea69ead2ab726fa6b1224d08c841ea0d33d61b6a746003b7ddffef045b0b1366370c19f85ca55cd947584611ff5ebc06a7b27eafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-frontdoor \
python3.10dist(azure-mgmt-frontdoor) \
python310-azure-mgmt-frontdoor \
python3dist(azure-mgmt-frontdoor)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
