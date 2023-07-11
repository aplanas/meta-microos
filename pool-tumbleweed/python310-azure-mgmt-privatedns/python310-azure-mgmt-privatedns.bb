SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-privatedns-1.1.0-1.2.noarch.rpm"
RPM_HASH = "9a8ffa372b2c3a21ab6794d694d267724ae709f0fb79baf6fb042b765bb42f8261c3263d0f48a09906cc1d0c3521bf88c37c696a168ff5829856ab1d555f254f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-mgmt-privatedns \
python310-azure-mgmt-privatedns \
python3dist-azure-mgmt-privatedns"

RDEPENDS:${PN} += "python-abi \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
