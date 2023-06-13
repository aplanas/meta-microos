SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-privatedns-1.1.0-1.1.noarch.rpm"
RPM_HASH = "0f01af131de8fd5af8e665fd7adc1179e87cc24d0094aaaea1c2fbd186abf0be9601eb2ef8bda7c0d1a5c431ab3589b83163cfae923f345ab865be5aa1cd50ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-privatedns \
python3.10dist(azure-mgmt-privatedns) \
python310-azure-mgmt-privatedns \
python3dist(azure-mgmt-privatedns)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
