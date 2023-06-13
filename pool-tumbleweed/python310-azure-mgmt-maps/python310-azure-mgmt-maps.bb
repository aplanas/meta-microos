SUMMARY = "Microsoft Azure Maps Client Library"
DESCRIPTION = "This is the Microsoft Azure Maps Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-maps-2.0.0-1.8.noarch.rpm"
RPM_HASH = "374d6c053eaf867d03d4d75977113c10420f65cb1ac6aa774b376f5bd6151650d3a1594908eb0287f8239da6f75c0d4e80bfb0809227a7c2845c33fcb09e0ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-maps \
python3.10dist(azure-mgmt-maps) \
python310-azure-mgmt-maps \
python3dist(azure-mgmt-maps)"

RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
