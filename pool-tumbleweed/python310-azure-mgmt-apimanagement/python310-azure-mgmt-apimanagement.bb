SUMMARY = "Microsoft Azure API Management Client Library"
DESCRIPTION = "This is the Microsoft Azure API Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-azure-mgmt-apimanagement-4.0.0-1.1.noarch.rpm"
RPM_HASH = "d3d15ff2194df583a96896cd4f24f845ee2871a9950827e3fd6045604b7d6434447f286997febbf3166d91e702233409cac90c3e41a6efbace1674c165d771cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-apimanagement \
python3.10dist(azure-mgmt-apimanagement) \
python310-azure-mgmt-apimanagement \
python3dist(azure-mgmt-apimanagement)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
